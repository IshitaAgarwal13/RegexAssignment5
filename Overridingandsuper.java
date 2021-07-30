import java.util.Scanner;

class EventRegistration{
	String name;
	String nameOfEvent;
	double registrationFee;
	
	public EventRegistration(String name, String nameOfEvent) {
		this.name = name;
		this.nameOfEvent = nameOfEvent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameOfEvent() {
		return nameOfEvent;
	}

	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	public void registerEvent() {
	    if(nameOfEvent.equals("ShakeALeg")) {
			registrationFee=100;
		}
		else if(nameOfEvent.equals("Sing&Win")) {
			registrationFee=150;
		}
		else if(nameOfEvent.equals("Actathon")) {
			registrationFee=70;
		}
		else if(nameOfEvent.equals("PlayAway")) {
			registrationFee=130;
		}
		else {
		    System.out.println("Please choose a valid Event");	
		    return;
		}

		
	}
	
}

class SingleEventRegistration extends EventRegistration{
	int participantNo;

	public SingleEventRegistration(String name, String nameOfEvent, int participantNo ) {
		super(name, nameOfEvent);
        this.participantNo=participantNo;
	}

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	public void registerEvent() {
		super.registerEvent();
		System.out.println("Thank You "+name+" for your participation. Your reegistration fee is: "+registrationFee);
		System.out.println("You are participant no: "+participantNo);
		
	}
	
}

class TeamEventRegistration extends EventRegistration{
	int noOfParticipants;
	int teamNo;
	public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
		super(name, nameOfEvent);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	public int getNoOfParticipants() {
		return noOfParticipants;
	}
	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
	public void registerEvent() {
		if(nameOfEvent.equals("ShakeALeg")) {
			registrationFee=50;
		}
		else if(nameOfEvent.equals("Sing&Win")) {
			registrationFee=60;
		}
		else if(nameOfEvent.equals("Actathon")) {
			registrationFee=80;
		}
		else if(nameOfEvent.equals("PlayAway")) {
			registrationFee=100;
		}
		else {
		    System.out.println("Please choose a valid Event");	
		    return;
		}
		registrationFee=noOfParticipants*registrationFee;
		System.out.println("Thank You "+name+" for your participation. Your registration fee is: "+registrationFee);
		System.out.println("You are participant no: "+teamNo);

	}
	
}

public class ShowYourTalentRegistration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EventRegistration participant1 =new SingleEventRegistration("Jenny","Sing&Win",1);
		participant1.registerEvent();
		
		EventRegistration team1 =new TeamEventRegistration("Aura","ShakeALeg",5,1);
		team1.registerEvent();
		
		EventRegistration participant2 =new SingleEventRegistration("Hudson","PlayAway",2);
		participant2.registerEvent();
	}

}
