package maxdistructo.mdaddons.method

public class BaseItem extends Item{

private String name;

    public ItemBase(String name) {
        this.name = name;
        setRegistryName(Main.modID, name);
    }

    @Override
    public String getUnlocalizedName() {
        return "item." + modID + ":" + name;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        if (getHasSubtypes()) {
            return getUnlocalizedName() + "." + stack.getItemDamage();
        }

        return getUnlocalizedName();
    }

}
