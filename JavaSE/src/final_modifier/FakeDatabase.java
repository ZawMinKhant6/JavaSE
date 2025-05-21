package final_modifier;

 class FakeDatabase {
	
	final static Authentication[] database = {
			
			new Authentication("mgmg","1234",true),
			new Authentication("masapal","apple",false),
			new Authentication("kyawkyaw","kyaw11",true),
			new Authentication("aung","2468",true),
			new Authentication("kaung","a123",false),
			new Authentication("hackzoe","99999",false)
	};
	
	static Authentication authenticate(String username,String password) {
		
		for(final Authentication auth: database) {
			if((auth.username.equals(username)) && (auth.password.equals(password))) {
			
				
				return auth;
				
			}
		}
			return null;
	}
}
