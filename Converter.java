import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the cryptocurrency converter! Which Cryptocurrency would you like to convert to? ");
        System.out.println("(BTC, ETH, USDT, BNB, USDC, SOL, XRP, LUNA, ADA, AVAX, DOT, DOGE, BUSD, UST, SHIB, WBTC, CRO, MATIC, NEAR, STETH, ATOM, DAI, LTC, LINK, TRX)");
        String crypto = scanner.nextLine();
        if (crypto.equals("BTC")) {
            System.out.println("The exchange rate for Bitcoin to USD is 46,382 to 1.");
        } else if (crypto.equals("ETH")) {
            System.out.println("The exchange rate for Ethereum to USD is 3,492.89 to 1.");
        } else if (crypto.equals("USDT")) {
            System.out.println("The exchange rate for Tether to USD is 0.999 to 1.");
        } else if (crypto.equals("BNB")) {
            System.out.println("The exchange rate for BNB to USD is 447.8 to 1.");
        } else if (crypto.equals("USDC")) {
            System.out.println("The exchange rate for USD coin to USD is 1 to 1.");
        } else if (crypto.equals("SOL")) {
            System.out.println("The exchange rate for Solana to USD is 135.63 to 1.");
        } else if (crypto.equals("XRP")) {
            System.out.println("The exchange rate for XRP to USD is 0.837 to 1.");
        } else if (crypto.equals("LUNA")) {
            System.out.println("The exchange rate for Terra to USD is 112.42 to 1.");
        } else if (crypto.equals("ADA")) {
            System.out.println("The exchange rate for Cardano to USD is 1.18 to 1.");
        } else if (crypto.equals("AVAX")) {
            System.out.println("The exchange rate for Avalanche to USD is 96.6 to 1.");
        } else if (crypto.equals("DOT")) {
            System.out.println("The exchange rate for Polkadot to USD is 23.03 to 1.");
        } else if (crypto.equals("DOGE")) {
            System.out.println("The exchange rate for Dogecoin to USD is 0.145 to 1.");
        } else if (crypto.equals("BUSD")) {
            System.out.println("The exchange rate for Binance USD to USD is 1 to 1.");
        } else if (crypto.equals("UST")) {
            System.out.println("The exchange rate for TerraUSD to USD is 0.999 to 1.");
        } else if (crypto.equals("SHIB")) {
            System.out.println("The exchange rate for Shiba Inu to USD is 0.000 to 1.");
        } else if (crypto.equals("WBTC")) {
            System.out.println("The exchange rate for Wrapped Bitcoin to USD is 46,321 to 1.");
        } else if (crypto.equals("CRO")) {
            System.out.println("The exchange rate for Cronos to USD is 0.480 to 1.");
        } else if (crypto.equals("MATIC")) {
            System.out.println("The exchange rate for BTC to USD is 1.67 to 1.");
        } else if (crypto.equals("NEAR")) {
            System.out.println("The exchange rate for NEAR Protocol to USD is 16.18 to 1.");
        } else if (crypto.equals("STETH")) {
            System.out.println("The exchange rate for Lido Staked Ether to USD is 348.99 to 1.");
        } else if (crypto.equals("ATOM")) {
            System.out.println("The exchange rate for Cosmos Hub to USD is 32 to 1.");
        } else if (crypto.equals("DAI")) {
            System.out.println("The exchange rate for Dai to USD is 0.999 to 1.");
        } else if (crypto.equals("LTC")) {
            System.out.println("The exchange rate for Litecoin to USD is 126.95 to 1.");
        } else if (crypto.equals("LINK")) {
            System.out.println("The exchange rate for Chainlink to USD is 18.15 to 1.");
        } else if (crypto.equals("TRX")) {
            System.out.println("The exchange rate for Tron to USD is 0.072 to 1.");
        }
        

        scanner.close();






        
    }
}
