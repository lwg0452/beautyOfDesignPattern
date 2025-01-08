package Command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CommandDemo {

    private static final int MAX_HANDLED_REQ_COUNT_PER_LOOP = 100;
    private static Queue<Command> queue = new LinkedList<Command>();

    public static void main(String[] args) {
        while (true) {
            List<Request> requests = new ArrayList<Request>();
            // 省略获取 request 从操作

            for (Request request: requests) {
                Event event = request.getEvent();
                Command command = null;
                if (event.equals(Event.GOT_DIAMOND)) {
                    command = new GotDiamondCommand();
                } else if (event.equals(Event.GOT_STAR)) {
                    command = new GotStarCommand();
                } else if (event.equals(Event.GOT_FIRE)) {
                    // command = new GotFireCommand;
                } else if (event.equals(Event.HIT_OBSTACLE)) {
                    // command = new HitObstacleCommand();
                }
                queue.offer(command);
            }

            int handledCount = 0;
            while (handledCount < MAX_HANDLED_REQ_COUNT_PER_LOOP) {
                if (queue.isEmpty()) {
                    break;
                }
                Command command = queue.poll();
                command.execute();
                handledCount++;
            }
        }
    }
}
