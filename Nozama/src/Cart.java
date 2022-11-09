import java.util.ArrayList;
import java.util.Iterator;
/*
* This is a class that is part of a CustomerAccount
*
* */

public class Cart {

  /**
   * Constructor
   * @Author Eyan
   */
  Cart(){
    CartContainer = new ArrayList<IItem>();
  }

  /**
   * Returns Container list
   */
  public ArrayList<IItem> getCart(){
    return CartContainer;
  }

  /**
   * Add a new item to the Arraylist
   * @param newItem IItem to add to cart
   */
  public void addItem(IItem newItem){
    CartContainer.add(newItem);
  }

  /**
   * Removes IItem from CartContainer
   * @param removedItem
   */
  public void removeItem(IItem removedItem){
    for(IItem item : CartContainer){
      if(item.equals(removedItem)) {
        CartContainer.remove(item);
      }
    }
  }
  
  public void viewCart(){
    for(IItem item : CartContainer){
      item.toString();
    }
  }

  /**
   * Tells NozamaSystem to process payment And remove items from SellerAccount inventory
   */
  public void checkout(){

    // NozamaSystem.ProcessPayment(/*Final discounted price goes here*/);  // returns true or false to see if payment continues thorough.

    // destroy cart. No longer needed.

  }
  
  



  private ArrayList<IItem> CartContainer;
  private float total;
  private float discount;

}