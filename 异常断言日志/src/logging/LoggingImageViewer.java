package logging;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;


public class LoggingImageViewer {
	public static void main(String args[]) {
		if(System.getProperty("java.util.logging.config.class")==null&&System.getProperty("java.util.logging.config.file")==null)
		{
			try
			{
				Logger.getLogger("com.horstmann.corejava").setLevel(Level.ALL);
				final int LOG_ROTATION_COUNT=10;
				Handler handler=new FileHandler("%h/LoggingImageViewer.log",0,LOG_ROTATION_COUNT);
				Logger.getLogger("com.horstmann.corejava");
			}
			catch(IOException e)
			{
				Logger.getLogger("com.horsmann.corejava").log(Level.SEVERE, "Can't creatnlog file handler", e);
				
			}
		}
		EventQueue.invokeLater(()->
		{
			Handler windowHandler=new WindowHandler();
			windowHandler.setLevel(Level.ALL);
			Logger.getLogger("com.horsmann.corejava").addHandler(windowHandler);
			
			JFrame frame=new ImageViewerFrame();
			frame.setTitle("LoggingImageViewer");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Logger.getLogger("com.horsmann.corejava").fine("Showing frame");
			frame.setVisible(true);//将frame对象显示出来,窗口一般是隐藏的 setVisible(false)可将窗口隐藏隐藏
			
		});
	}
	
}
class ImageViewerFrame extends JFrame
{
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=400;
	
	private JLabel label;
	private static Logger logger=Logger.getLogger("com.horsmann.corejava");
	
	public ImageViewerFrame()
	{
		logger.entering("ImageViewerFrame","<init>");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		//set up menu bar
		JMenuBar menuBar=new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu=new JMenu("File");
		menuBar.add(menu);
		
		JMenuItem openItem=new JMenuItem("open");
		menu.add(openItem);
		openItem.addActionListener(new FileOpenListener());
		
		JMenuItem exitItem=new JMenuItem("exit");
		menu.add(exitItem);
		exitItem.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						logger.fine("Exiting.");
						System.exit(0);
					}
				});
		label=new JLabel();
		add(label);
		logger.exiting("ImageViewerFrame", "<init>");
	}
	private class FileOpenListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			logger.entering("ImageViewerFrame.FileOpenListener", "actiomPerformed",event);
			/*public void entering(string sourceclass,
            string sourcemethod)

			记录一个方法条目。

			这是一个可为方法记录条目的便捷方法。记录带消息 "entry" 的 logrecord、日志级别 finer、给定的 sourcemethod 和 sourceclass。

			参数：
			sourceclass - 发出日志记录请求的类名
			sourcemethod - 所输入的方法名*/
			JFileChooser chooser=new JFileChooser();
			chooser.setCurrentDirectory(new File("."));
			chooser.setFileFilter(new javax.swing.filechooser.FileFilter()
					{
						public boolean accept(File f)
						{
							return f.getName().toLowerCase().endsWith(".gif")||f.isDirectory();
						}
						public String getDescription()
						{
							return "GIF Images";
						}
					});
			int r=chooser.showOpenDialog(ImageViewerFrame.this);
			if(r==JFileChooser.APPROVE_OPTION)
			{
				String name=chooser.getSelectedFile().getPath();
				logger.log(Level.FINE, "Reading file {0}", name);
				label.setIcon(new ImageIcon(name));
			}
			else
				logger.fine("File open dialog canceled");
			logger.exiting("ImageViewerFrame.FileOpenListener", "actionPerformed");
		}
	}
}

class WindowHandler extends StreamHandler
{
	private JFrame frame;
	public WindowHandler()
	{
		frame=new JFrame();
		final JTextArea output=new JTextArea();
		output.setEditable(false);
		frame.setSize(200,200);
		frame.add(new JScrollPane(output));
		frame.setFocusableWindowState(false);
		frame.setVisible(true);
		setOutputStream(new OutputStream()
				{
					public void write(int b)
					{
						
					}
					public void write(byte[] b,int off,int len)
					{
						output.append(new String(b,off,len));
					}
				});
	}
	public void publish(LogRecord record)
	{
		if(!frame.isVisible())
			return;
		super.publish(record);
		flush();
	}
}













