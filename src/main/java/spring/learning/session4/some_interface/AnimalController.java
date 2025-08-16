package spring.learning.session4.some_interface;

import java.util.List;

/**
 * Controller class for animal-related operations.
 */
public class AnimalController {

    /**
     * Processes a list of animals and makes each animal produce its noise.
     *
     * <p>This generic method signature offers several important advantages over a simpler List&lt;IAnimal&gt; approach:</p>
     * <ol>
     *   <li>Type preservation: Maintains the specific subtype information throughout the method call.</li>
     *   <li>API flexibility: You can pass any homogeneous list (List&lt;Dog&gt;, List&lt;Cat&gt;) directly without conversion:
     *       <pre>
     *       List&lt;Dog&gt; dogs = new ArrayList&lt;&gt;();
     *       fetchAnimal(dogs); // Works without conversion
     *       </pre>
     *   </li>
     *   <li>Prevents collection pollution: If using just List&lt;IAnimal&gt;, the method could potentially add
     *       different animal types to your list if it were mutable, which could break type safety.</li>
     *   <li>Improved caller experience: Users don't need to create new lists or perform unsafe casts when they have a specific animal list:
     *       <pre>
     *       // With the generic version - no conversion needed
     *       fetchAnimal(dogList);
     *
     *       // Without generics would require:
     *       // List&lt;IAnimal&gt; temp = new ArrayList&lt;&gt;(dogList);
     *       // fetchAnimal(temp);
     *       </pre>
     *   </li>
     * </ol>
     * <p>This pattern maintains both flexibility (accepts any IAnimal subtype) and type safety (preserves the exact list type).</p>
     *
     * @param <T>     type parameter that extends IAnimal
     * @param animals the list of animals to process
     */
/*
    public static <T extends IAnimal> void fetchAnimal(List<T> animals) {
        animals.forEach(IAnimal::makenoise);
    }
*/
    public static void fetchAnimal(List<? extends IAnimal> animals) {
        animals.forEach(IAnimal::makenoise);
    }
}