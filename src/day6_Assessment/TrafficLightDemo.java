
package day6_Assessment;
public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;
        for (int i = 0; i < 6; i++) {
            System.out.println("Current light: " + light);
            light = (TrafficLight) light.next();
        }
    }
}
interface State {
    State next();
}
enum TrafficLight implements State {
    RED {
        public State next() {
            return GREEN;
        }
    },
    GREEN {
        public State next() {
            return YELLOW;
        }
    },
    YELLOW {
        public State next() {
            return RED;
        }
    };
}

/*
output:
Current light: RED
Current light: GREEN
Current light: YELLOW
Current light: RED
Current light: GREEN
Current light: YELLOW
*/

