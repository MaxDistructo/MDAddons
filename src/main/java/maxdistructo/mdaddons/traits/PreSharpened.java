package maxdistructo.mdaddons.traits

public class PreSharpened extends AbstractTrait {

public static final PreSharpened presharpened = new PreSharpened();
public int BONUS_DAMAGE = 2;

public PreSharpened(){
        super("presharpened",0xFFFFFF);
}

@Override
	public float damage(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, float newDamage, boolean isCritical) {
		newDamage += BONUS_DAMAGE;
		return super.damage(tool, player, target, damage, newDamage, isCritical);
	}


}
