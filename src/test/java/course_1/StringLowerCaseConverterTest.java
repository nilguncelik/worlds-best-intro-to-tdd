package course_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringLowerCaseConverterTest {
	@Test
	public void shouldConvertToLowercase() {
		StringLowerCaseConverter converter = new StringLowerCaseConverter();
		assertEquals("nilgun", converter.convert("NILGUN"));
	}

}
