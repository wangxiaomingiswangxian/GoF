package com.sample.gof23.service.behavioralpattern.memento;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class MementoClient {

    private final Caretaker caretaker = new Caretaker();

    public int run(String... args) {
        Meeting meet1 = new Meeting();
		Meeting meet2 = new Meeting();
        meet1.setMeetName("meetName1");
        meet1.setMeetType("meetType1");
        meet1.setMeetDate("2009-01-01");
        meet1.setMeetLeader("meetLeader1");
        meet1.setMeetParticipants("meetParticipants1");
        meet1.setDecide("decide1");
        meet1.doDecide();
        Memento memento = meet1.createMemento();

        //Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(memento.getMeetDate(), memento);

        //Meeting meet2 = new Meeting();
        meet2.setMeetName("meetName2");
        meet2.setMeetType("meetType2");
        meet2.setMeetDate("2009-02-01");
        meet2.setMeetLeader("meetLeader2");
        meet2.setMeetParticipants("meetParticipants2");
        meet2.setDecide("decide2");
        meet2.doDecide();
        memento = meet2.createMemento();

        caretaker.saveMemento(memento.getMeetDate(), memento);

        caretaker.showContent();

        return 0;
    }


}
