//����� ����� ���� ���� �������

public class Tank {
	private int acceleration; 					//�������� ��������� 		(�\�^2)
	private int speedMax;						//���������� �������� 		(�\�)
	private int timeAim;						//����� ��������� �� ���� 	(�)
	private double chanceHit;					//����������� �����. � ���� (0;1)
	
	public Tank(){
		this.acceleration = -1;
		this.speedMax = -1;
		this.timeAim = -1;
		this.chanceHit = -1;
	}
	public Tank(int acceleration, int speedMax, int timeAim, double chanceHit){
		this.acceleration = acceleration;
		this.speedMax = speedMax;
		this.timeAim = timeAim;
		this.chanceHit = chanceHit;	
	}
	public int GetAcceleration(){
		return acceleration;
	}
	public int GetSpeedMax(){
		return speedMax;
	}
	public int GetTimeAim(){
		return timeAim;
	}
	public double GetChanceHit(){
		return chanceHit;
	}
	
}
