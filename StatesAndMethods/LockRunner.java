class LockRunner{
	public static void main(String []args){
		int [] lockNum={2,8,7,1,3};
		int [] lockValues=Lock.noOfLocks(lockNum);
		
		for(int lock:lockValues){	
			System.out.println("lock numbers are : "+lock);
		}
		
		String[] holderNames=Lock.ownerName();
		for(String nameOfholders:holderNames){
			System.out.println("owners name are : "+nameOfholders);
		}
	}
}