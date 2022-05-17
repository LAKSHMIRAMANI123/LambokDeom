package ai.jobiak.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@ToString
@Data
public class Package {
	
	private int productId;
	private String name;
	private double price;

}
