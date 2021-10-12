package baseline;

import java.util.ArrayList;
import java.util.List;

public class MagicEightBall {
    public String magicEightBall(int randNum) {
        List<String> responseList = new ArrayList<>();
        //      Add the responses to the list
        responseList.add("Yes");
        responseList.add("No");
        responseList.add("Maybe");
        responseList.add("Ask again later.");
        //      print out the response at randNum index
        return responseList.get(randNum);
        //Simple output statement method, no test required
    }
}
