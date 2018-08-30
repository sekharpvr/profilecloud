package com.apsis.profile.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.apsis.profile.model.Counter;

/**
 * Service Class used to serve different services requested by Controller.
 * @author sekhar
 *
 */
@Service
public class CounterServiceImpl implements CounterService {

	public static final Logger logger = LoggerFactory.getLogger(CounterServiceImpl.class);
	private static List<Counter> counters;
	
	static {
		counters = loadInitialCounters();
    }
	
	/**
	 * This method used to return the Counter details based on Counter Name.
	 * @return Counter - 
	 */
	@Override
	public Counter findByName(String counterName) {
		return counters.stream().filter(obj -> obj.getCounterName().equals(counterName)).findAny().orElse(null);
	}
	
	/**
	 * This method used to return Test Counter name as["profileofsekhar"] and initial value as[1].
	 * @return List<Counter>
	 */
	private static List<Counter> loadInitialCounters() {
		List<Counter> listOfCounters = new ArrayList<>();
		listOfCounters.add(new Counter("profileofsekhar",1));
		return listOfCounters;
	}


	/**
	 * This method used to return all the Counters and Corresponding Values in a list.
	 * @return List<Counter>
	 */
	@Override
	public List<Counter> getAllCounters() {
		return counters;
	}


	/**
	 * This method used to create new Counter.
	 */
	@Override
	public void createCounter(Counter counter) {

		counters.add(counter);
	}


	/**
	 * This method used to update the Counter with the incremented Value.
	 */
	@Override
	public void updateCounter(Counter existingCounter) {
		existingCounter.setValue(existingCounter.getValue() + 1);
		/*counters.forEach(counterObj -> counterObj.getCounterName().equals(counterName) {
			counterObj.setValue(existingCounter.getValue() + 1);
		});*/
		
	}
}
