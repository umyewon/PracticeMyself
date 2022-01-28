package chap07;

public class DmbCellphoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
	
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb(20);
		dmbCellPhone.receiveVoice("하이");
	}

}
