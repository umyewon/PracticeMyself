package chap07;

public class DmbCellphoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
	
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb(20);
		dmbCellPhone.receiveVoice("����");
	}

}
