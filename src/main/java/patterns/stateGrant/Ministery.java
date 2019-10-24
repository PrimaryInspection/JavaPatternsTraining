package patterns.stateGrant;

import patterns.stateGrant.states.Confirmed;
import patterns.stateGrant.states.Created;
import patterns.stateGrant.states.Reviewed;

/**21.10.2019
 *
 * Возможно придумаю фишку с деньгами, типа каждый этап стоит определенную сумму, если её нет,то грант отклонен,
 * потом можно предложить ввести с клавиатуры сумму, если хватает, то продолжаем, вплоть до состояния 'Confirmed'
 * */

public class Ministery {

    Grant grant;


    void setGrantState(Grant grantState){
        grant = grantState;
    }

    void nextGrantState(){
        if(grant instanceof Created){
            setGrantState(new Reviewed());
        }else if (grant instanceof Reviewed){
            setGrantState(new Confirmed());
        }else if (grant instanceof Confirmed){
            setGrantState(new Reviewed());
        }
    }

    void proccess(){
        grant.changeState();
    }
}
