package akkamaddi.simpletungsten.code;

import java.util.Random;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class HandlerJoinWorld
{
    public static double rand;
    public static int range;

    public static RandomRange random = new RandomRange();

    /**
     * This class allows zombies and skeletons to spawn holding/wearing SimpleOres items.
     */
    @ForgeSubscribe
    public void EntityJoinWorldEvent(EntityJoinWorldEvent event)
    {
        rand = Math.random();
        range = random.nextInt(1, 57);

        if ((rand <= 0.02D) && ((event.entity instanceof EntityLiving)) && ((event.entity instanceof EntitySkeleton | event.entity instanceof EntityZombie)))
        {
            EntityLiving living = (EntityLiving)event.entity;

            if (range == 1)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.tungstenChest));
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.tungstenLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenSword));
            }

            if (range == 2)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenHelm));
            }

            if (range == 3)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.tungstenChest));
            }

            if (range == 4)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.tungstenLegs));
            }

            if (range == 5)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenBoots));
            }

            if (range == 6)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenSword));
            }

            if (range == 7)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenShovel));
            }

            if (range == 8)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenAxe));
            }

            if (range == 9)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenPickaxe));
            }

            if (range == 10)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenHoe));
            }

            if (range == 11)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.tungstenChest));
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.tungstenLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenSword));
            }

            if (range == 12)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenHelm));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenSword));
            }

            if (range == 13)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.tungstenChest));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenSword));
            }

            if (range == 14)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.tungstenLegs));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenSword));
            }

            if (range == 15)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenSword));
            }

            if (range == 16)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenSword));
            }

            if (range == 17)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenShovel));
            }

            if (range == 18)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenAxe));
            }

            if (range == 19)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenPickaxe));
            }

            if (range == 20)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenHoe));
            }

            if (range == 21)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenCarbideHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.tungstenCarbideChest));
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.tungstenCarbideLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenCarbideBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenCarbideSword));
            }

            if (range == 22)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenCarbideHelm));
            }

            if (range == 23)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.tungstenCarbideChest));
            }

            if (range == 24)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.tungstenCarbideLegs));
            }

            if (range == 25)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenCarbideBoots));
            }

            if (range == 26)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenCarbideSword));
            }

            if (range == 27)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenCarbideShovel));
            }

            if (range == 28)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenCarbideAxe));
            }

            if (range == 29)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenCarbidePickaxe));
            }

            if (range == 30)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenCarbideHoe));
            }

            if (range == 31)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.valframHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.valframChest));
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.valframLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.valframBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.valframSword));
            }

            if (range == 32)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.valframHelm));
            }

            if (range == 33)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.valframChest));
            }

            if (range == 34)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.valframLegs));
            }

            if (range == 35)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.valframBoots));
            }

            if (range == 36)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.valframSword));
            }

            if (range == 37)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.valframShovel));
            }

            if (range == 38)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.valframAxe));
            }

            if (range == 39)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.valframPickaxe));
            }

            if (range == 40)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.valframHoe));
            }
            
			
			if (range == 41)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.tungstenChest));
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.tungstenLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenSword));
            }
						
			if (range == 42)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenPickaxe));
            }
			
			if (range == 43)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.tungstenChest));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenAxe));
            }
			
			if (range == 44)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.tungstenLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenShovel));
            }
			
			if (range == 45)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenHoe));
            }

			if (range == 46)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenCarbideHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.tungstenCarbideChest));
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.tungstenCarbideLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenCarbideBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenCarbideSword));
            }
			
			if (range == 47)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenCarbideHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenCarbideBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenCarbidePickaxe));
            }

			if (range == 48)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenCarbideHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.tungstenCarbideChest));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenCarbideAxe));
            }

			if (range == 49)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.tungstenCarbideLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenCarbideBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenCarbideShovel));
            }

			if (range == 50)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenCarbideHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenCarbideBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenCarbideHoe));
            }

			if (range == 51)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.valframHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.valframChest));
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.valframLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.valframBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.valframSword));
            }
			
			if (range == 52)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.valframHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.valframBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.valframPickaxe));
            }

			if (range == 53)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.valframHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.valframChest));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.valframAxe));
            }

			if (range == 54)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.valframLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.valframBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.valframShovel));
            }

			if (range == 55)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.valframHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.valframBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.valframHoe));
            }
						
			if (range == 56)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.tungstenChest));
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.tungstenLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.tungstenCarbideSword));
            }
			
			if (range == 57)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SimpleTungstenCore.tungstenHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(SimpleTungstenCore.tungstenChest));
                living.setCurrentItemOrArmor(2, new ItemStack(SimpleTungstenCore.tungstenLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(SimpleTungstenCore.tungstenBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(SimpleTungstenCore.valframSword));
            }
			
        }
    }
}

class RandomRange extends Random
{
	public int nextInt(int min, int max)
	{
		return nextInt(max - min + 1) + min;
	}
}