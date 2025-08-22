package day5_Assessment;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
class TimeServer {
    public static interface Client {
        void updateTime(LocalDateTime now);
    }
    private List<Client> clients = new ArrayList<>();
    public void registerClient(Client client) {
        clients.add(client);
    }
    public void notifyClients() {
        LocalDateTime currentTime = LocalDateTime.now();
        for (Client client : clients) {
            client.updateTime(currentTime);
        }
    }
}
class ClockDisplay implements TimeServer.Client {
    private String name;

    public ClockDisplay(String name) {
        this.name = name;
    }
    public void updateTime(LocalDateTime now) {
        System.out.println(name + " Clock updated: " + now);
    }
}
class LoggerService implements TimeServer.Client {
    public void updateTime(LocalDateTime now) {
        System.out.println("Log: Time updated to " + now);
    }
}
public class CallbackHandling {
    public static void main(String[] args) {
        TimeServer server = new TimeServer();
        ClockDisplay clock1 = new ClockDisplay("Digital");
        ClockDisplay clock2 = new ClockDisplay("Analog");
        LoggerService logger = new LoggerService();
        server.registerClient(clock1);
        server.registerClient(clock2);
        server.registerClient(logger);
        server.notifyClients();
    }

}
