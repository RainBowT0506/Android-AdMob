# [Google AdMob 類型](https://firebase.google.com/docs/admob/android/quick-start)
橫幅式（Banner）

![image](https://developers.google.com/admob/images/format-banner.svg)

插頁式（Interstitial）

![image](https://developers.google.com/admob/images/format-interstitial.svg)

原生式（Native）

![image](https://developers.google.com/admob/images/format-native.svg)

已獲得獎勵式（Rewarded）

![image](https://developers.google.com/admob/images/format-rewarded.svg)

插頁式獎勵廣告（Rewarded interstitial）

![image](https://developers.google.com/static/admob/images/format-rewarded-interstitial.svg)

應用程式開啟頁面廣告（App open）

![image](https://developers.google.com/static/admob/images/format-app-open.svg)

----
# [googleads-mobile-android-examples](https://github.com/googleads/googleads-mobile-android-examples)
# 範例種類
## AdMob
### App Open
![CleanShot 2024-07-10 at 14.46.21](https://hackmd.io/_uploads/Sk6BCssPR.png)
### Banner
![CleanShot 2024-07-10 at 14.47.03](https://hackmd.io/_uploads/HkNORssD0.png)

### Interstitial
![CleanShot 2024-07-10 at 14.47.59](https://hackmd.io/_uploads/SJajAjowR.png)

![CleanShot 2024-07-10 at 14.47.46](https://hackmd.io/_uploads/r1Wo0jsPC.png)

### Rewarded Interstitial
![CleanShot 2024-07-10 at 14.49.11](https://hackmd.io/_uploads/BkwekniwA.png)
![CleanShot 2024-07-10 at 14.49.22](https://hackmd.io/_uploads/H1bbyhiD0.png)

### Rewarded Video
![CleanShot 2024-07-10 at 14.50.09](https://hackmd.io/_uploads/S1k4J2oPA.png)
![CleanShot 2024-07-10 at 14.50.17](https://hackmd.io/_uploads/H1541hiv0.png)

### Native Advanced
### FullScreenNativeExample
![CleanShot 2024-07-10 at 14.52.39](https://hackmd.io/_uploads/r1UTkhjv0.png)
## Advanced
### API Demo
![CleanShot 2024-07-10 at 14.17.41](https://hackmd.io/_uploads/HkY5PsoPR.png)
#### AdMob
##### AdListener
![CleanShot 2024-07-10 at 14.19.25](https://hackmd.io/_uploads/BJhgujiDR.png)

##### Ad Targeting
![CleanShot 2024-07-10 at 14.20.45](https://hackmd.io/_uploads/ByFI_jjv0.png)

##### Banner sizes
![CleanShot 2024-07-10 at 14.21.55](https://hackmd.io/_uploads/Hk-q_jjwC.png)

##### Collapsible banner ad

![CleanShot 2024-07-10 at 14.22.09](https://hackmd.io/_uploads/SJ0cdioDR.png)

##### Custom Mute This Ad


#### AdManager
##### Ad sizes
![CleanShot 2024-07-10 at 14.26.12](https://hackmd.io/_uploads/SysstoivR.png)

##### App events
![CleanShot 2024-07-10 at 14.26.59](https://hackmd.io/_uploads/BJbaYijvC.png)


##### Category exclusion
![CleanShot 2024-07-10 at 14.27.11](https://hackmd.io/_uploads/rkE19iowC.png)

##### Custom targeting
![CleanShot 2024-07-10 at 14.28.43](https://hackmd.io/_uploads/BJ6Q9oivR.png)

##### Fluid size
![CleanShot 2024-07-10 at 14.29.08](https://hackmd.io/_uploads/H1xScjsvA.png)

##### PPID
![CleanShot 2024-07-10 at 14.30.02](https://hackmd.io/_uploads/SyCuqssvR.png)

##### Custom Video Controls
![CleanShot 2024-07-10 at 14.30.28](https://hackmd.io/_uploads/SkMq5soDR.png)


----
### Inline Adaptive Banner RecyclerView
![CleanShot 2024-07-10 at 14.38.32](https://hackmd.io/_uploads/Hy3O2jiDA.png)
### RewardedSSVExample

#### Google AdMob Rewarded SSV (server-side verification) 
使用場景為何
[驗證伺服器端驗證 (SSV) 回呼](https://developers.google.com/admob/android/ssv?hl=zh-tw#get_content_to_be_verified)

Google AdMob Rewarded SSV（伺服器端驗證）主要應用於確保用戶在觀看完廣告視頻後所獲得的獎勵是經過驗證且安全的。以下是一些具體的使用場景和好處：

##### 使用場景

1. **防止欺詐**：
   - 使用 SSV 可以確保只有在用戶真正觀看完廣告視頻後，才會發放獎勵。這能有效防止用戶使用模擬器或其他欺詐手段偽造觀看記錄來獲取獎勵。

2. **數據完整性**：
   - 伺服器端驗證確保從客戶端發送的數據未被篡改或偽造。通過驗證數據的簽名，可以確保這些數據是由 Google 提供的且未被修改。

3. **增強安全性**：
   - 使用 SSL/TLS 保護通信，並且在伺服器端進行驗證，避免在客戶端存儲和處理敏感數據，從而提高整體安全性。

4. **獎勵發放準確性**：
   - 伺服器端驗證確保獎勵只有在用戶完成既定操作後才會發放，這有助於維持應用內經濟的穩定性和公平性。

5. **業務邏輯**：
   - 可以在伺服器端根據驗證結果執行複雜的業務邏輯，例如更新用戶數據庫、記錄獎勵歷史、發送通知等。

##### 操作流程

1. **用戶觀看廣告視頻**：
   - 用戶在應用內觸發觀看廣告視頻的行為。

2. **客戶端發送回調請求**：
   - 廣告播放完成後，Google 會觸發一個回調請求到應用伺服器，請求中包含了簽名和其他必要的參數。

3. **伺服器驗證簽名**：
   - 應用伺服器接收到回調請求後，會使用 Google 提供的公開金鑰來驗證簽名，確保請求的真實性和完整性。

4. **發放獎勵**：
   - 簽名驗證通過後，伺服器可以按照業務邏輯發放對應的獎勵給用戶。

5. **回應結果**：
   - 伺服器將驗證結果返回給 Google，並且可以選擇將結果展示給用戶。

##### 具體應用案例

- **遊戲應用**：用戶在遊戲內觀看廣告視頻後獲得遊戲內貨幣、道具、生命等獎勵。
- **教育應用**：用戶觀看廣告視頻後獲得免費解鎖課程或資源的機會。
- **社交應用**：用戶觀看廣告視頻後獲得應用內虛擬物品，如表情包、貼圖等。

總之，Google AdMob Rewarded SSV 通過增加驗證步驟來確保獎勵的發放是安全且有效的，從而提升用戶體驗並保護應用開發者的利益。

#### SSVController
這段 Java 程式碼實現了一個名為 `SSVController` 的 Spring Boot REST 控制器，用於處理和驗證 Google AdMob 獎勵視頻 SSV 回調請求。以下是主要功能的詳細說明：

##### 類別和方法簡介

1. **SSVController 類別**：這個類別用於處理和驗證 Google AdMob 獎勵視頻的回調請求。

2. **parsePublicKeysJson 方法**：從 Google 提供的 URL 下載並解析公開金鑰的 JSON 文件，並將其轉換為一個 Map，其中包含 `keyId` 和對應的 `ECPublicKey`。

3. **verify 方法**：使用指定的公開金鑰驗證數據的簽名。首先，它從 JSON 文件中獲取公開金鑰，然後使用該金鑰驗證數據的簽名。

4. **index 方法**：這是處理 GET 請求的控制器方法。它從請求中提取參數，檢查必要的參數是否存在，然後構建需要驗證的數據並進行簽名驗證，最後返回驗證結果。

##### 主要步驟

1. **解析公開金鑰**：
    - 從指定的 URL 下載 JSON 文件。
    - 解析 JSON 文件，提取 `keyId` 和對應的 Base64 編碼的公開金鑰。
    - 將 Base64 編碼的公開金鑰解碼並轉換為 `ECPublicKey` 對象。
    - 將這些 `ECPublicKey` 存儲在一個 Map 中，以便後續使用。

2. **驗證簽名**：
    - 使用下載並解析的公開金鑰來驗證數據的簽名。
    - 如果指定的 `keyId` 存在於 Map 中，則使用對應的公開金鑰驗證簽名。
    - 如果簽名驗證成功，則返回驗證成功的結果；如果失敗，則返回相應的錯誤信息。

3. **處理 HTTP 請求**：
    - 從請求中提取 `key_id` 和 `signature` 參數。
    - 構建需要驗證的數據，這些數據來自請求的查詢字符串（不包括 `signature` 和 `key_id`）。
    - 調用 `verify` 方法來驗證簽名。
    - 返回驗證結果，包括成功或失敗的信息。


----
## Ad Manager
### App Open
![CleanShot 2024-07-10 at 10.28.27](https://hackmd.io/_uploads/Hk31GdjPR.png)
### Banner
![CleanShot 2024-07-10 at 10.37.20](https://hackmd.io/_uploads/SybgN_iwR.png)

### Interstitial
![CleanShot 2024-07-10 at 10.38.13](https://hackmd.io/_uploads/r1dm4OivA.png)

### Rewarded Interstitial
![CleanShot 2024-07-10 at 10.40.22](https://hackmd.io/_uploads/ryiiEusD0.png)

### Rewarded Video
![CleanShot 2024-07-10 at 10.47.22](https://hackmd.io/_uploads/SyO8IuiDC.png)

### Native Ads
![CleanShot 2024-07-10 at 10.38.58](https://hackmd.io/_uploads/Bk_PVujP0.png)



# [透過 AdMob 應用程式使用 Google Analytics 和 Firebase 的更多功能](https://firebase.google.com/docs/admob/analytics-and-firebase?platform=android)

# Solutions
## [使用 Firebase 測試新 AdMob 廣告格式的採用情況](https://firebase.google.com/docs/tutorials/test-ad-format-adoption/solution-overview)
## [使用 Firebase 最佳化 AdMob 廣告頻率](https://firebase.google.com/docs/tutorials/optimize-ad-frequency/solution-overview)
## [教學：使用 AdMob、Google Analytics 和 Firebase 優化混合創收](https://firebase.google.com/docs/tutorials/optimize-hybrid-monetization)

# AdRequest 與 AdManagerAdRequest 的差別
* [AdRequest](https://developers.google.com/android/reference/com/google/android/gms/ads/AdRequest)
* [AdManagerAdRequest](https://developers.google.com/android/reference/com/google/android/gms/ads/admanager/AdManagerAdRequest)
* [比較 Ad Manager、AdSense 和 AdMob](https://support.google.com/admanager/answer/9234653)
* [Clarification about AdMob and Google Ad Manager](https://groups.google.com/g/google-admob-ads-sdk/c/F8X-DFSWsdI)

## Q1
Google AdMob 的 `AdRequest` 和 Google Ad Manager 的 `AdManagerAdRequest` 都用於請求廣告，但它們的用途和功能有所不同。以下是詳細的比較：

### Google AdMob AdRequest
- **用途**：主要為移動應用開發者設計，用於將廣告貨幣化。
- **平台**：主要用於移動應用程序中。
- **整合**：簡化了開發者在應用中集成廣告的過程。
- **目標定位**：支持基本的廣告目標定位選項，如性別、地理位置和年齡。
- **廣告網絡**：使用 AdMob 自身的廣告網絡，並可包含與其他廣告網絡的中介。
- **使用情境**：適合希望快速高效地在應用中集成廣告的開發者，而不需要高級的廣告管理功能。

### Google Ad Manager AdRequest
- **用途**：面向需要更複雜廣告服務需求的出版商，包括網頁和移動平台。
- **平台**：用於移動應用程序和網站。
- **整合**：需要更全面的設置，提供高級廣告管理功能。
- **目標定位**：提供更高級的目標定位和受眾分割選項，包括自訂定位和再營銷。
- **廣告網絡**：可與更多的廣告網絡和需求來源整合，包括程序化購買廣告。
- **使用情境**：適合需要更多控制權的廣告庫存的大型出版商或開發者，通過高級廣告服務技術來最大化收入。

### 主要差異
- **複雜性**：`AdRequest` 更簡單和直觀，而 `AdManagerAdRequest` 提供更高級和細緻的廣告控制。
- **目標定位功能**：`AdManagerAdRequest` 提供比 `AdRequest` 更強大的目標定位選項。
- **整合範圍**：`AdRequest` 主要用於移動應用程序，而 `AdManagerAdRequest` 用於網頁和移動平台。
- **廣告網絡靈活性**：`AdManagerAdRequest` 允許與更多的廣告網絡和需求來源整合。

總結來說，如果你是一名移動應用開發者，希望快速簡單地集成廣告，AdMob 的 `AdRequest` 是更好的選擇。如果你需要高級的廣告管理功能，並且在管理大量的廣告庫存，Google Ad Manager 的 `AdManagerAdRequest` 更為合適。

## Q2
Google AdMob 的 AdRequest 和 Google Ad Manager 的 AdManagerAdRequest 主要在於它們的用途和一些特定功能上的差異。以下是兩者的主要區別：

### AdRequest (Google AdMob)
1. **目標受眾**：AdMob 主要針對個體開發者和小型應用程序開發商。它更適合那些不需要複雜廣告管理功能的開發者。
2. **用戶界面**：AdMob 提供一個簡單易用的界面，方便開發者快速整合廣告。
3. **廣告類型**：AdMob 支持多種廣告格式，包括橫幅廣告、插頁廣告、獎勵廣告和原生廣告。
4. **用戶定義數據**：AdRequest 允許開發者設置一些基本的定向參數，如性別、年齡和興趣。
5. **廣告來源**：主要依賴於 Google 的廣告網絡。

### AdManagerAdRequest (Google Ad Manager)
1. **目標受眾**：Google Ad Manager 主要針對大型發行商和需要高級廣告管理功能的用戶。這些用戶通常需要更複雜的廣告操作和收入優化工具。
2. **用戶界面**：Google Ad Manager 提供更高級的界面，允許用戶進行更詳細的廣告配置和管理。
3. **廣告類型**：與 AdMob 類似，支持多種廣告格式，但還提供更高級的廣告定制選項。
4. **用戶定義數據**：AdManagerAdRequest 支持更豐富的定向選項，允許發行商基於用戶數據進行更精細的廣告定向。
5. **廣告來源**：除了 Google 的廣告網絡外，還可以整合第三方廣告網絡，提供更靈活的廣告來源管理。

### 總結
- **簡單性 vs. 複雜性**：AdRequest 適合尋求簡單解決方案的小型開發者，而 AdManagerAdRequest 則適合需要更高級功能的大型發行商。
- **功能**：AdManagerAdRequest 提供更多定制和管理選項，適合需要高級廣告操作和收入優化的用戶。

選擇哪一個取決於您的需求和應用程序的規模。如果您是一個小型開發者，AdMob 的 AdRequest 可能已經足夠。如果您需要更高級的廣告管理功能，則應考慮使用 Google Ad Manager 的 AdManagerAdRequest。

# Rewarded Interstitial 與 Rewarded Video 的差別
* [Mobile, ad revenue & interstitial video - ironSource](https://www.is.com/interstitial-ads/)
    插頁式廣告（interstitial ads）在應用程式流程的自然停頓期間出現；
    獎勵影片廣告（rewarded video ads）則在用戶非常需要時出現。
* 

## Q1
Google Firebase AdMob 提供的廣告形式有多種，其中 Rewarded Interstitial 和 Rewarded Video 都是獎勵型廣告，使用者在觀看完廣告後可獲得某種獎勵。這兩者之間的主要差異如下：

### Rewarded Interstitial 廣告
1. **混合形式**：Rewarded Interstitial 廣告結合了插頁式廣告和獎勵型廣告的特性。使用者必須完成觀看才能獲得獎勵，但廣告形式可能是靜態的或視頻。
2. **展示時機**：通常在應用的自然中斷點（如遊戲關卡之間或應用過程中的轉換階段）展示。
3. **互動性**：不一定需要完整觀看視頻，可能包含靜態圖像或短動畫，只要使用者完成互動即可獲得獎勵。

### Rewarded Video 廣告
1. **視頻專屬**：Rewarded Video 廣告是專門的視頻廣告，使用者需要完整觀看完視頻才能獲得獎勵。
2. **展示時機**：適合在應用中需要較長時間停頓或較高使用者參與度的情況下展示，例如遊戲中的大獎或重要資源。
3. **互動性**：使用者必須完整觀看視頻，通常長度為15到30秒，以確保能夠獲得獎勵。

### 總結
- **Rewarded Interstitial** 更加靈活，適合任何需要中斷但不一定需要完整視頻的情況。
- **Rewarded Video** 則適合需要高參與度的情境，並且獎勵較高時使用。

這兩種廣告形式各有優勢，應根據應用場景和目標受眾來選擇合適的廣告形式。

## Q2
Google Firebase AdMob 提供的廣告類型中，Rewarded Interstitial 和 Rewarded Video 是兩種常見的激勵型廣告。以下是這兩者的主要差別：

### Rewarded Interstitial 廣告
1. **展示方式**：Rewarded Interstitial 廣告是一種全屏廣告，會在應用中某個自然的中斷點展示，通常是在關卡結束、功能轉換等時機。
2. **獎勵機制**：用戶需要觀看完整廣告才能獲得獎勵，如遊戲內貨幣、道具等。
3. **使用體驗**：這種廣告介於傳統的插頁廣告和激勵視頻廣告之間，既提供了全屏的展示效果，也帶有獎勵機制。
4. **廣告時長**：通常時長較短，一般在 15 到 30 秒之間。
5. **互動性**：互動性較低，用戶主要是觀看廣告內容。

### Rewarded Video 廣告
1. **展示方式**：Rewarded Video 廣告是一種全屏視頻廣告，用戶可以在應用中的特定位置選擇觀看，以獲得特定獎勵。
2. **獎勵機制**：用戶需觀看完整的視頻廣告才能獲得獎勵，例如遊戲內的額外生命、道具等。
3. **使用體驗**：這類廣告通常在用戶主動選擇觀看時展示，提升了用戶的參與度和對獎勵的期望。
4. **廣告時長**：通常時長較長，一般在 30 到 60 秒之間。
5. **互動性**：互動性較低，但由於用戶主動選擇觀看，接受度較高。

### 總結
- **Rewarded Interstitial** 更像是加強版的插頁廣告，帶有獎勵機制，適合在應用自然中斷點展示。
- **Rewarded Video** 則是一種用戶主動選擇觀看的視頻廣告，通常時長較長，適合在用戶需要特定獎勵時使用。

希望這些資訊能幫助你更好地理解 Google Firebase AdMob 提供的這兩種廣告形式。
