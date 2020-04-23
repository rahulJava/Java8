package Optional;

import java.util.Optional;

public class orElse
{
	public static void main(String[] args) {
		
		
		Optional<String> gender = Optional.ofNullable("MALE");
        Optional<String> emptyGender = Optional.empty();

        System.out.println(gender.orElse("<N/A>")); //MALE
        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>

        System.out.println(gender.orElseGet(() -> "<N/A>")); //MALE
        System.out.println(emptyGender.orElseGet(() -> "<N/A>")); //<N/A>
	}

}
