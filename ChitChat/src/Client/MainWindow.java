package Client;

import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;

import CComponents.*;

public class MainWindow extends JFrame
{
	Icon icon;//�û�ͷ��
	JLabel nicknameLabel;//�û��ǳ�
	JLabel styleWord;//�û��ĸ���ǩ��
	JSplitPane spilitBar;//�зִ���,���Ϊ��ϵ��,�ұ�����Ϣ
	JMenuBar operats;//���Ͻǲ˵���
	JMenu menu;//�˵�
	JMenuItem searchContacts;//��������
	JMenuItem createContactsGroup;//��������
	
	//TODO:msgList,ctsList,contactsList���������趨
	ACanvas myOnlineState;//�û�����״̬
	Box userInfo;
	
	MainWindow(){
		setLayout(new FlowLayout());
		init();
		setBounds(400, 400, 800, 600);
		setVisible(true);
	}
	public void init() {
		
		persInfoInit();
		messageInit();
		ContactsInit();
		
		
	}
	public void persInfoInit(){//TODO:�û���Ϣ��ʼ��
	
		icon = new ImageIcon("URL");//TODO:url:ͷ��Ŀ¼
		
	}
	public void messageInit() {//TODO: ��Ϣ��ʼ��
		
	}
	public void ContactsInit() {//TODO:��ϵ���б��ʼ��
		
	}
	public int deleteContacts() {//TODO:ɾ����ϵ��
		return 0;
	}
	public int addContacts() {//TODO: �����ϵ��
		return 0;
	}
	public int changeContactsRemark() {//TODO:������ϵ�˱�ע
		return 0;
	}
	public int preferenceSet(int statement) {//TODO:��������,����:����״̬
		return 0;
	}
}
