package JFrame;
import java.awt.*;
import java.io.File;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @Author: zaj
 * @Decription:
 * @Date:
 * @Email: 2996922498@qq.com
 */
public class Interface extends JFrame {

        public Interface(){
                initJFrame();

                this.setVisible(true);

                initButton();
        }

        public void initJFrame(){
                this.setSize(600, 500);
                this.setTitle("KWIC(Key Word In Context)，Parnas (1972)索引系统");
                this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                this.setLayout(null);


        }

        public void initButton(){
                //创建按钮
                JButton button1 = new JButton("主程序-子程序");
                JButton button2 = new JButton("面向对象");
                JButton button3 = new JButton("事件系统");
                JButton button4 = new JButton("管道-过滤");

                button1.setBounds(100,100,150,50);
                button2.setBounds(300,100,150,50);
                button3.setBounds(100,300,150,50);
                button4.setBounds(300,300,150,50);


                //设置点击事件
                button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                JFrame f1 = new Frame1();
                                f1.setVisible(true);

                                File file = new File("C:\\Users\\86183\\Desktop\\output.txt");
                                try {
                                        Desktop.getDesktop().open(file);
                                } catch (IOException ex) {
                                        ex.printStackTrace();
                                }

                                try {
                                        // 动态加载类
                                        URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\Program\\develop\\Java\\Softexperiment\\src\\")});
                                        Class<?> myClass = classLoader.loadClass("Demo1.zaj");
                                        // 调用类的静态方法
                                        Method method = myClass.getMethod("main", String[].class);
                                        String[] args = new String[]{};
                                        method.invoke(null, (Object) args);
                                } catch (Exception ex) {
                                        ex.printStackTrace();
                                }
                        }
                });

                button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                JFrame f2 = new Frame2();
                                f2.setVisible(true);

                                File file = new File("C:\\Users\\86183\\Desktop\\output.txt");
                                try {
                                        Desktop.getDesktop().open(file);
                                } catch (IOException ex) {
                                        ex.printStackTrace();
                                }

                                try {
                                        // 动态加载类
                                        URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\Program\\develop\\Java\\Softexperiment\\src\\")});
                                        Class<?> myClass = classLoader.loadClass("Demo2.Main");
                                        // 调用类的静态方法
                                        Method method = myClass.getMethod("main", String[].class);
                                        String[] args = new String[]{};
                                        method.invoke(null, (Object) args);
                                } catch (Exception ex) {
                                        ex.printStackTrace();
                                }
                        }


                });

                button3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                JFrame f3 = new Frame3();
                                f3.setVisible(true);

                                File file = new File("C:\\Users\\86183\\Desktop\\output.txt");
                                try {
                                        Desktop.getDesktop().open(file);
                                } catch (IOException ex) {
                                        ex.printStackTrace();
                                }

                                try {
                                        // 动态加载类
                                        URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\Program\\develop\\Java\\Softexperiment\\src\\")});
                                        Class<?> myClass = classLoader.loadClass("Demo3.Main");
                                        // 调用类的静态方法
                                        Method method = myClass.getMethod("main", String[].class);
                                        String[] args = new String[]{};
                                        method.invoke(null, (Object) args);
                                } catch (Exception ex) {
                                        ex.printStackTrace();
                                }
                        }
                });

                button4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                JFrame f4 = new Frame4();
                                f4.setVisible(true);

                                File file = new File("C:\\Users\\86183\\Desktop\\output.txt");
                                try {
                                        Desktop.getDesktop().open(file);
                                } catch (IOException ex) {
                                        ex.printStackTrace();
                                }

                                try {
                                        // 动态加载类
                                        URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\Program\\develop\\Java\\Softexperiment\\src\\")});
                                        Class<?> myClass = classLoader.loadClass("Demo4.Main");
                                        // 调用类的静态方法
                                        Method method = myClass.getMethod("main", String[].class);
                                        String[] args = new String[]{};
                                        method.invoke(null, (Object) args);
                                } catch (Exception ex) {
                                        ex.printStackTrace();
                                }
                        }
                });



                add(button1);
                add(button2);
                add(button3);
                add(button4);
        }
}
