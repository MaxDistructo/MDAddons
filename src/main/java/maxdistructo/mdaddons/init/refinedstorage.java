package maxdistructo.mdaddons.init

public class refinedstorage{

public static final Item refinedIron;

static{
      refinedIron = Arrays.asList(
                          new ResourceLocation(refinedstorage:quartz_enriched_iron),
                         .stream().map(Item.REGISTRY::getObject)
				.filter(item -> item != null)
				.findAny().orElse(null);
}

public static void init(){
if(Loader.isModLoaded("refinedstorage")){

Material quartzRefinedIron = new Material("quartzRefinedIron_mdaddons",TextFormatting.GREY);
quartzRefinedIron.addTrait(PreSharpened.presharpened);
quartzRefinedIron.addTrait(TraitMagnetic.traitmagnetic(2));
quartzRefinedIron.addItem(refinedIron, 1, Material.VALUE_Ingot);
quartzRefinedIron.setCraftable(true);
quartzRefinedIron.setRepresentativeItem(refinedIron);


}

}

}
