package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
    public void equals_returns_correct_output() {
        // assertEquals(true, team.equals(team));
        // assertEquals(false, team.equals("test"));
        // Team t1 = new Team("test-team");
        // assertEquals(true, team.equals(t1));
        // t1.setName("tester");
        // assertEquals(false, team.equals(t1));
        // Team t2 = new Team("test-team");
        // t2.addMember("Danny");
        // assertEquals(false, team.equals(t2));

        // t1.setName("team1");
        // t1.addMember("Danny");
        // t1.addMember("Kate");
        // assertEquals(false, teams.equals());

        
        Team t1 = new Team();
        t1.setName("team1");
        t1.addMember("Danny");
        t1.addMember("Kate");

        Team t2 = t1;

        Object obj = new Object();

        Team t3 = new Team();
        t3.setName("team1");
        t3.addMember("Danny");
        t3.addMember("Kate");
        
        Team t4 = new Team();
        t4.setName("team2");
        t4.addMember("Danny");
        t4.addMember("Kate");
        
        Team t5 = new Team();
        t5.setName("team1");
        t5.addMember("Danny");
        t5.addMember("Lowly");


        Team t6 = new Team();
        t6.setName("team2");
        t6.addMember("Danny");
        t6.addMember("Lowly");

        assertEquals(true, t1.equals(t2));
        assertEquals(false, t1.equals(obj));
        assertEquals(true, t1.equals(t3));
        assertEquals(false, t1.equals(t4));
        assertEquals(false, t1.equals(t5));


        

    }
    @Test
    public void hashCode_returns_correct_output(){
        Team t1 = new Team();

        int result = t1.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult,result);

        // Team t1 = new Team();
        // t1.setName("team1");
        // t1.addMember("Danny");
        // t1.addMember("Kate");

        // Team t2 = t1;

        // Object obj = new Object();

        // Team t3 = new Team();
        // t3.setName("team1");
        // t3.addMember("Danny");
        // t3.addMember("Kate");
        
        // Team t4 = new Team();
        // t4.setName("team2");
        // t4.addMember("Danny");
        // t4.addMember("Kate");
        
        // Team t5 = new Team();
        // t5.setName("team1");
        // t5.addMember("Danny");
        // t5.addMember("Lowly");

        // Team t5 = new Team();
        // t5.setName("team1");
        // t5.addMember("Danny");
        // t5.addMember("Lowly");

        // Team t6 = new Team();
        // t6.setName("team2");
        // t6.addMember("Danny");
        // t6.addMember("Lowly");

        // assertEquals(true, t1.hashcode().equals(t2.hashCode()));
        // assertEquals(false, t1.hashcode().equals(obj.hashCode()));
        // assertEquals(true, t1.hashcode().equals(t3.hashCode()));
        // assertEquals(false, t1.hashcode().equals(t4.hashCode()));
        // assertEquals(false, t1.hashcode().equals(t5.hashCode()));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
