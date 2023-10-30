package JFrame;

import javax.swing.*;

/**
 * @Author: zaj
 * @Decription:
 * @Date:
 * @Email: 2996922498@qq.com
 */
public class Frame1 extends JFrame {
    public Frame1(){
        this.setSize(1000,1000);
        this.setTitle("主程序-子程序");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        this.setAlwaysOnTop(false);

        insertImage();
    }

    public void insertImage(){

            ImageIcon icon = new ImageIcon("D:\\Program\\develop\\Java\\JFrame\\src\\f1.png");
            JLabel jLabel = new JLabel(icon);
            setLayout(null);
            jLabel.setBounds(250, 0, icon.getIconWidth(), icon.getIconHeight()); // 设置标签位置和大小

            add(jLabel);
    }


}
