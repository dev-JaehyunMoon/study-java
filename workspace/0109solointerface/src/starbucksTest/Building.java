package starbucksTest;

public class Building {
	public static void main(String[] args) {
		StarBucks gangnam = new StarBucks();
		StarBucks jamsil = new StarBucks();
		
		jamsil.register(new FormAdapter() {

			@Override
			public String[] getMenu() {
				
				return new String[] {"��"};
			}
			
		});
		gangnam.register(new Form() {

			@Override
			public String[] getMenu() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void sell(String menu) {
				// TODO Auto-generated method stub
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menu + "�Ǹ� �Ϸ�");
					}
				}
				
				
			}
			
			@Override
			public String[] getMenu() {
				return
			}
		});
	
	}	
		

}
