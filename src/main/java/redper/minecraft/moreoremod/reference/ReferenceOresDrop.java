package redper.minecraft.moreoremod.reference;

import net.minecraft.item.Item;
import redper.minecraft.moreoremod.init.ModItems;

public enum ReferenceOresDrop {

	AMETHYSTORE(ModItems.amethyst, 0, 1),
	SAPPHIREORE(ModItems.sapphire, 0, 1),
	RUBYORE(ModItems.ruby, 0, 1);
	
	private Item drop;
	private int damage;
	private int quantity;
	
	private ReferenceOresDrop(Item drop, int damage, int quantity) {
		
		this.drop = drop;
		this.damage = damage;
		this.quantity = quantity;
		
	}
	
	public Item getDrop() {
		return drop;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
}
