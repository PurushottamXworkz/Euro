class Board{
	
	public int costOfBoard;
	public double sizeOfBoard;
	public String boardColor;
	
	public void setCostOfBoard(int costOfBoard){
		this.costOfBoard=costOfBoard;
	}
	
	public void setSizeOfBoard(double sizeOfBoard){
		this.sizeOfBoard=sizeOfBoard;
	}
	
	public void setBoardColor(String boardColor){
		this.boardColor=boardColor;
	}
	
	public int getCostOfBoard(){
		System.out.println("the cost of board is==="+costOfBoard);
		return costOfBoard;
	}
	
	public double getSizeOfBoard(){
		System.out.println("the size of board is==="+sizeOfBoard);
		return sizeOfBoard;
	}
	
	public String getBoardColor(){
		System.out.println("board color is==="+boardColor);
		return boardColor;
	}
	
}