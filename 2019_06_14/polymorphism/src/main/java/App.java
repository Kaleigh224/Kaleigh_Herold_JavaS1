public class App {
    public static void main(String[] args) {
        Developer dev = new Developer();
        TeamLead lead = new TeamLead();
        Architect arch = new Architect();

        Developer dev2 = new TeamLead(); // this will not work because the type is not the same
        Developer dev3 = new Architect(); // this will not work

        TeamLead lead2;

        lead2 = (TeamLead)dev2;
        lead2.planSprint();


    }
}
