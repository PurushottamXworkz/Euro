class CalenderRunner{
	public static void main(String args[]){
		Calender calender=new Calender();
		Calender calender1=new Calender(15);
		Calender calender2=new Calender(15,"Shaabadimath");
		Calender calender3=new Calender(15,"Shaabadimath",8714256300l);
		Calender calender4=new Calender(15,"Shaabadimath",8714256300l,16.4215d);
		Calender calender5=new Calender(15,"Shaabadimath",8714256300l,16.4215d,'R');
		Calender calender6=new Calender(15,"Shaabadimath",8714256300l,16.4215d,'R',true);
		Calender calender7=new Calender(15,"Shaabadimath",8714256300l,16.4215d,'R',true,"Regular");	
		Calender calender8=new Calender(15,"Shaabadimath",8714256300l,16.4215d,'R',true,"Regular",45);
		Calender calender9=new Calender(15,"Shaabadimath",8714256300l,16.4215d,'R',true,"Regular",45,"Gadag");
	}
}