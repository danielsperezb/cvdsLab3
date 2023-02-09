package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;
public class Registry {
	private ArrayList<Integer> people = new ArrayList<>();

	
	public RegisterResult registerVoter(Person p) {
// TODO Validate person and return real result.
	
	
	
    if(!p.isAlive()){
        return RegisterResult.DEAD;
    }else if(p.getAge()<1) {
    	return RegisterResult.INVALID_AGE;	
    }else if(p.getAge()<18) {
    	return RegisterResult.UNDERAGE;
    }else{
    	if(people.contains(p.getId())) {
    		return RegisterResult.DUPLICATED;
    	}else {
    		people.add(p.getId());
    		return RegisterResult.VALID;
    	}
    	
    }
}
}
