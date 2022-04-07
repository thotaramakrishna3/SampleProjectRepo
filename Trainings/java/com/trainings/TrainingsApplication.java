package com.trainings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingsApplication.class, args);
	}

	/*@Component
	public class CommandLineRunnerImpl implements CommandLineRunner {
		@Autowired
		private ProfilesRepo profileRepo;
		@Autowired
		private Profile profile;
		@Autowired
		private CountryRepo countryRepo;
		@Autowired
		private Country country;
		@Autowired
		private StateRepo stateRepo;
		@Autowired
		private State state;

		@Override
		public void run(String... args) throws Exception {
			profile.setName("Admin");
			profile.setCreate(true);
			profile.setDelete(true);
			profile.setUpdate(true);
			profile.setView(true);
			profile.setName("Manager");
			profile.setCreate(true);
			profile.setDelete(false);
			profile.setUpdate(true);
			profile.setView(true);
			profile.setName("User");
			profile.setCreate(false);
			profile.setDelete(false);
			profile.setUpdate(true);
			profile.setView(true);
			profileRepo.save(profile);
			state.setName("Kerala");
			state.setName("Maharastra");
			state.setName("Andhra Pradash");
			state.setName("California.");
			state.setName("Florida");
			state.setName("New Jersey");
			state.setName("Western Australia");
			state.setName("South Australia");
			state.setName("Manitoba");
			state.setName("New Brunswick");
			state.setName("Alberta");
			stateRepo.save(state);
			country.setName("India");
			country.setName("USA");
			country.setName("Austrila");
			country.setName("Canada");
			countryRepo.save(country);

		}
	}*/

}
