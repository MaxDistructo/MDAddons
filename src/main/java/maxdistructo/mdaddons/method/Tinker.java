package maxdistructo.mdaddons.method

public class Tinker{

public static void registerMolten(String oreDictSuffix){
Fluid myFluid = new Fluid("molten"+oreDictSuffix, new ResourceLocation("tconstruct:blocks/fluids/molten_metal"), new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow"));
FluidRegistry.registerFluid(myFluid); // fluid has to be registered
FluidRegistry.addBucketForFluid(myFluid); // add a bucket for the fluid
Block fluidBlock = new BlockFluidClassic(myFluid, Material.lava);
NBTTagCompound tag = new NBTTagCompound();
tag.setString("fluid", myFluid.getName()); // name of the fluid
tag.setString("ore", oreDict); // ore-suffix: ingotFoo, blockFoo, oreFoo,...
tag.setBoolean("toolforge", true); // if set to true, blockFoo can be used to build a toolforge
FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", tag);
}
public static void registerAlloy(){

NBTTagList tagList = new NBTTagList();
// if you have access to the fluid-instance you can also do FluidStack.writeToNBT
NBTTagCompound fluid = new NBTTagCompound();
fluid.setString("FluidName", "bronze");
fluid.setInteger("Amount", 144); // 144 = 1 ingot
tagList.appendTag(fluid);
// first alloy fluid
fluid = new NBTTagCompound();
fluid.setString("FluidName", "copper");
fluid.setInteger("Amount", 108); // 3/4 ingot
tagList.appendTag(fluid);
// second alloy fluid
fluid = new NBTTagCompound();
fluid.setString("FluidName", "tin");
fluid.setInteger("Amount", 36); // 1/4 ingot
tagList.appendTag(fluid);

NBTTagCompound message = new NBTTagCompound();
message.setTag("alloy", tagList);
FMLInterModComms.sendMessage("tconstruct", "alloy", message);
}

}
