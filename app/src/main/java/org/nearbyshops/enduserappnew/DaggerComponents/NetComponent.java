package org.nearbyshops.enduserappnew.DaggerComponents;


import dagger.Component;
import org.jetbrains.annotations.NotNull;
import org.nearbyshops.enduserappnew.Carts.CartItem.CartItemAdapter;
import org.nearbyshops.enduserappnew.Carts.CartItem.CartItemListActivity;
import org.nearbyshops.enduserappnew.Carts.CartsList.CartsListFragment;
import org.nearbyshops.enduserappnew.Carts.PlaceOrderActivity;
import org.nearbyshops.enduserappnew.DaggerModules.AppModule;
import org.nearbyshops.enduserappnew.DaggerModules.NetModule;
import org.nearbyshops.enduserappnew.DeliveryAddress.DeliveryAddressActivity;
import org.nearbyshops.enduserappnew.DeliveryAddress.EditAddress.EditAddressFragment;
import org.nearbyshops.enduserappnew.EditProfile.ChangeEmail.FragmentChangeEmail;
import org.nearbyshops.enduserappnew.EditProfile.ChangeEmail.FragmentVerifyEmail;
import org.nearbyshops.enduserappnew.EditProfile.ChangePassword.FragmentChangePassword;
import org.nearbyshops.enduserappnew.EditProfile.ChangePhone.FragmentChangePhone;
import org.nearbyshops.enduserappnew.EditProfile.ChangePhone.FragmentVerifyPhone;
import org.nearbyshops.enduserappnew.EditProfile.FragmentEditProfileGlobal;
import org.nearbyshops.enduserappnew.Home;
import org.nearbyshops.enduserappnew.ItemDetailNew.ItemDetailFragment;
import org.nearbyshops.enduserappnew.ItemImages.ItemImageListFragment;
import org.nearbyshops.enduserappnew.ItemsByCategoryTypeSimple.ItemCategoriesFragmentSimple;
import org.nearbyshops.enduserappnew.ItemsInShopByCat.AdapterItemsInShop;
import org.nearbyshops.enduserappnew.ItemsInShopByCat.ItemsInShopByCatFragment;
import org.nearbyshops.enduserappnew.Login.LoginFragment;
import org.nearbyshops.enduserappnew.Login.LoginGlobalFragment;
import org.nearbyshops.enduserappnew.Login.LoginUsingOTPFragment;
import org.nearbyshops.enduserappnew.Login.ServiceIndicatorFragment;
import org.nearbyshops.enduserappnew.MarketDetail.MarketDetailFragment;
import org.nearbyshops.enduserappnew.MarketDetail.RateReviewDialogMarket;
import org.nearbyshops.enduserappnew.Markets.MarketsFragment;
import org.nearbyshops.enduserappnew.Markets.MarketsFragmentNew;
import org.nearbyshops.enduserappnew.Markets.SubmitURLDialog;
import org.nearbyshops.enduserappnew.Markets.ViewHolders.AdapterMarkets;
import org.nearbyshops.enduserappnew.Markets.ViewHolders.ViewHolderMarket;
import org.nearbyshops.enduserappnew.Markets.ViewHolders.ViewHolderSavedMarket;
import org.nearbyshops.enduserappnew.Markets.ViewModels.MarketViewModel;
import org.nearbyshops.enduserappnew.OneSignal.UpdateOneSignalID;
import org.nearbyshops.enduserappnew.OrderDetail.FragmentOrderDetail;
import org.nearbyshops.enduserappnew.OrderHistoryNew.OrdersFragment;
import org.nearbyshops.enduserappnew.OrderHistoryNew.OrdersFragmentNew;
import org.nearbyshops.enduserappnew.ProfileFragment;
import org.nearbyshops.enduserappnew.Services.UpdateServiceConfiguration;
import org.nearbyshops.enduserappnew.ShopDetailNew.RateReviewDialog;
import org.nearbyshops.enduserappnew.ShopDetailNew.ShopDetailFragment;
import org.nearbyshops.enduserappnew.ShopImages.ShopImageListFragment;
import org.nearbyshops.enduserappnew.ShopItemByItemNew.ShopItemFragment.AdapterShopItem;
import org.nearbyshops.enduserappnew.ShopItemByItemNew.ShopItemFragment.ShopItemFragment;
import org.nearbyshops.enduserappnew.ShopReview.ShopReviewAdapter;
import org.nearbyshops.enduserappnew.ShopReview.ShopReviewStats;
import org.nearbyshops.enduserappnew.ShopReview.ShopReviews;
import org.nearbyshops.enduserappnew.Shops.ListFragment.FragmentShopNew;
import org.nearbyshops.enduserappnew.SignUp.ForgotPassword.FragmentCheckResetCode;
import org.nearbyshops.enduserappnew.SignUp.ForgotPassword.FragmentEnterCredentials;
import org.nearbyshops.enduserappnew.SignUp.ForgotPassword.FragmentResetPassword;
import org.nearbyshops.enduserappnew.SignUp.FragmentEmailOrPhone;
import org.nearbyshops.enduserappnew.SignUp.FragmentEnterPassword;
import org.nearbyshops.enduserappnew.SignUp.FragmentVerify;


import javax.inject.Singleton;

/**
 * Created by sumeet on 14/5/16.
 */

@Singleton
@Component(modules={AppModule.class, NetModule.class})
public interface NetComponent {


    void Inject(ItemCategoriesFragmentSimple itemCategoriesFragmentSimple);


    void Inject(UpdateOneSignalID updateOneSignalID);

    void Inject(AdapterShopItem adapterShopItem);

    void Inject(ShopItemFragment shopItemFragment);

    void Inject(Home home);

    void Inject(UpdateServiceConfiguration updateServiceConfiguration);

    void Inject(ItemDetailFragment itemDetailFragment);

    void Inject(ItemImageListFragment itemImageListFragment);

    void Inject(LoginGlobalFragment loginGlobalFragment);

    void Inject(LoginUsingOTPFragment loginUsingOTPFragment);

    void Inject(ServiceIndicatorFragment serviceIndicatorFragment);

    void Inject(LoginFragment loginFragment);

    void Inject(OrdersFragmentNew ordersFragmentNew);

    void Inject(FragmentOrderDetail fragmentOrderDetail);

    void Inject(ShopDetailFragment shopDetailFragment);

    void Inject(ShopImageListFragment shopImageListFragment);

    void Inject(RateReviewDialog rateReviewDialog);

    void Inject(CartItemAdapter cartItemAdapter);

    void Inject(CartItemListActivity cartItemListActivity);

    void Inject(CartsListFragment cartsListFragment);

    void Inject(PlaceOrderActivity placeOrderActivity);

    void Inject(FragmentShopNew fragmentShopNew);

    void Inject(AdapterItemsInShop adapterItemsInShop);

    void Inject(ItemsInShopByCatFragment itemsInShopByCatFragment);

    void Inject(EditAddressFragment editAddressFragment);

    void Inject(DeliveryAddressActivity deliveryAddressActivity);

    void Inject(RateReviewDialogMarket rateReviewDialogMarket);

    void Inject(MarketDetailFragment marketDetailFragment);

    void Inject(AdapterMarkets adapterMarkets);

    void Inject(ViewHolderSavedMarket viewHolderSavedMarket);

    void Inject(ViewHolderMarket viewHolderMarket);

    void Inject(MarketViewModel marketViewModel);

    void Inject(MarketsFragment marketsFragment);

    void Inject(SubmitURLDialog submitURLDialog);

    void Inject(MarketsFragmentNew marketsFragmentNew);

    void Inject(FragmentChangePassword fragmentChangePassword);

    void Inject(FragmentChangeEmail fragmentChangeEmail);

    void Inject(FragmentVerifyEmail fragmentVerifyEmail);

    void Inject(FragmentChangePhone fragmentChangePhone);

    void Inject(FragmentVerifyPhone fragmentVerifyPhone);

    void Inject(FragmentEditProfileGlobal fragmentEditProfileGlobal);

    void Inject(ProfileFragment profileFragment);

    void Inject(ShopReviews shopReviews);

    void Inject(ShopReviewAdapter shopReviewAdapter);

    void Inject(ShopReviewStats shopReviewStats);

    void Inject(@NotNull OrdersFragment ordersFragment);

    void Inject(FragmentEmailOrPhone fragmentEmailOrPhone);

    void Inject(FragmentVerify fragmentVerify);

    void Inject(FragmentEnterPassword fragmentEnterPassword);

    void Inject(FragmentEnterCredentials fragmentEnterCredentials);

    void Inject(FragmentCheckResetCode fragmentCheckResetCode);

    void Inject(FragmentResetPassword fragmentResetPassword);
}
