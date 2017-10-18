package maxdistructo.mdaddons

public class MDUtil{

public static Item getItem(String itemID){
return Arrays.asList(
				new ResourceLocation(itemID))
				.stream().map(Item.REGISTRY::getObject)
				.filter(item -> item != null)
				.findAny().orElse(null);

}

}
