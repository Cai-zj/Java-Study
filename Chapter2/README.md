数据流分类:
    1)字节流:数据流中最小的数据单元是字节;
    2)字符流:数据流中最小的数据单元是字符; Java Unicode编码  一个字符 = 两个字节

Java.io 包中比较常用的五个类为:File,OutputStream,InputStream,Writer,Reader
接口为Serializable.

1,File（文件特征与管理）：用于文件或者目录的描述信息，例如生成新目录，修改文件名，删除文件，判断文件所在路径等。
    常用的有:FileInputStream, FileOutputStream, FileReader, FileWriter

2,InputStream（字节流，二进制格式操作）：抽象类，基于字节的输入操作，是所有输入流的父类。定义了所有输入流都具有的共同特征。
   Java的基本输入流: java.io.InputStream;
        
        public abstract class InputStream
         
   这个类提供了输入数据所需的一些基本方法:
        
        public abstract int read() throw IOException
        public int read(byte[] input) throw IOException
        public int read(byte[] input,int offset,int length) throw IOException
        public long skip(long n) throw IOException
        public int available() throw IOException
        public void close() throw IOException
    
3,OutputStream（字节流，二进制格式操作）：抽象类。基于字节的输出操作。是所有输出流的父类。定义了所有输出流都具有的共同特征。
   Java的基本输出流: java.io.OutputStream;
    
        public abstract class OutputStream
         
   这个类提供了写入数据所需的一些基本方法:
    
        public abstract void write(int b) throw IOException
        public void write(byte[] data) throw IOException
        public void write(byte[] data,int offset,int length) throw IOException
        public void flush() throw IOException
        public void close() throw IOException
        
4,Reader（字符流，文本格式操作）：抽象类，基于字符的输入操作。
    Reader类是 java.io.InputStream 类是镜像.它是一个抽象类,有连个保护的构造函数.
  与InputStream和Write类似,Reader类从来不直接使用,只通过其子类来使用.
    
5,Writer（字符流，文本格式操作）：抽象类，基于字符的输出操作。
    同上
    
6,RandomAccessFile（随机文件操作）：它的功能丰富，可以从文件的任意位置进行存取（输入输出）操作。
    



