package com.v4social.services;

import com.v4social.domain.Consultation;
import com.v4social.repo.ConsultationRepository;
import com.v4social.repo.UserConsultationVote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
private UserRepository userRepository;
private ConsultationRepository consultationRepository;

@Autowired
public UserService(UserRepository userRepository,ConsultationRepository consultationRepository ) {
this.userRepository = userRepository;
this.consultationRepository = consultationRepository;
   }

	public String vote(Consultation consultation, Integer numberVotes) {
		String voteOption="to define";
		return voteOption;
	    }

	    public UserConsultationVote vote(int userCode, int questionCode, int numberOfVotes){
	this.userCode = User.getCode();

		}

}
	

