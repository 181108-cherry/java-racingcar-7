package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    String name;
    int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition() {
        int randomNumber = Randoms.pickNumberInRange(0,9);
        if (randomNumber > 4) {
            this.position = position + 1;
        }
    }
}
}