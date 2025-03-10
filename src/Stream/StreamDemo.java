package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {


        // creating stream from Collection
        List<Integer> list= Arrays.asList(1,2,3,4,4);
        Stream<Integer>  stream=list.stream();

        // from array
        String [] s={"uj","kl"};
        Stream<String>  stream1=Arrays.stream(s);

        //using StreamOf
        Stream<String>  stream2=Stream.of("12","sfse");

        //infinte streams
        Stream<Integer> num=Stream.generate(()->1);
        






    }
}
