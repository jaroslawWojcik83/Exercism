import java.util.ArrayList;
import java.util.List;

/**
 * Created by wojcik.jaroslaw1 on 17.05.2019.
 */
public class Flattener {

    public List<Object> flatten(List<Object> list) {

        List<Object> result = new ArrayList<>();

        search(result, list);


        return result;
    }


    public void search(List<Object> result, List<Object> list) {

        for (Object element : list) {
            if (element == null) {
                continue;
            }

            if (element instanceof List) {
                search(result, (List<Object>) element);

            } else {
                result.add(element);
            }
        }

    }

}
