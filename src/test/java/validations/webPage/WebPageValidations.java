package validations.webPage;

import org.assertj.core.api.Assertions;

public class WebPageValidations {
	
	public static void validateTitle(String titleName, String expectedName)
	{
		  Assertions.assertThat(titleName)
		    .isNotBlank()
		    .isNotEmpty()
		    .isEqualTo(expectedName);
	}

}
