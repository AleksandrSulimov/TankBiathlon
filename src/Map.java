//this is Map
public class Map {
	
	private int amountStage;		//���������� ������
	private int amountFL;			//���������� �������
	private Stage stage[];
	private FiringLine FL[];
	
	public Map(){
		
	}
	public Map(int amountStage){
		amountFL = amountStage;
		stage = new Stage[amountStage];
		FL = new FiringLine[amountFL];
		
	}
	
	public void createStage(){
		
	}
	
}
