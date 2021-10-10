
package net.mcreator.evky.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.evky.itemgroup.EvKyItemGroup;
import net.mcreator.evky.EvkyModElements;

@EvkyModElements.ModElement.Tag
public class GreatstickItem extends EvkyModElements.ModElement {
	@ObjectHolder("evky:greatstick")
	public static final Item block = null;
	public GreatstickItem(EvkyModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(EvKyItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("greatstick");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
