package duckchallengeprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DuckManager {
	
	private List<Duck> duckList = new ArrayList<>();
	
	
	public void process(Duck duck) {
        System.out.println(duck);
    }

	
	
	public void SortAndDisplayDuckNames(){
		List<String> duckListNames  = new ArrayList<>();
		
		 for(Duck duck : duckList) {
			 duckListNames.add(duck.getName());
	           // process(duck);
	        }
		 Collections.sort(duckListNames);
		 System.out.println(duckListNames);
		 

	}
	
	public void SearchForDucksThatAreMallardsAndPrint()
	{
		
		  for (Duck d : duckList)
		  {
			  if(d.isAMallard()) {
		               System.out.println(d);
		         }
		  }
		  
		
	
	}



	public List<Duck> getDuckList() {
		return duckList;
	}



	public void setDuckList(List<Duck> duckList) {
		this.duckList = duckList;
	}
	

}
