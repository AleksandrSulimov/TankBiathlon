
public class Stage {
	private int lenghtStage;					//����� �����				(�)
	private int lengthPenaltyLoop;				//����� ��������� �����		(�)
	private double passabilitySoil;				//������������ ������		(0;1)
	private FiringLine FL;						//������� �����
	
	public Stage(){
		this.lenghtStage = -1;
		this.passabilitySoil = -1;
	}
	public Stage(int lenghtStage, int lengthPenaltyLoop, double passabilitySoil){
		this.lenghtStage = lenghtStage;
		this.lengthPenaltyLoop = lengthPenaltyLoop;
		this.passabilitySoil = passabilitySoil;
	}
	public int getLenghtStage(){
		return lenghtStage;
	}
	public int getLenghtPenaltyLoop(){
		return lengthPenaltyLoop;
	}
	public double getPassabilitySoil(){
		return passabilitySoil;
	}

}
