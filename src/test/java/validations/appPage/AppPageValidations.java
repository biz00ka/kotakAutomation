package validations.appPage;

import org.assertj.core.api.Assertions;

public class AppPageValidations {

	public static void validateInvalidUser(boolean flag)
	{
		  Assertions.assertThat(flag)
		    .isTrue()
		    .isNotNull();
	}
	
}
