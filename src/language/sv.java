package language;

public class sv implements Language {
    public sv() {}
    public String[] getStrings() { return strings; }

    static final String[] strings = {
        // Translation notes:
        // - Any line that begins with a "//" is a comment and is ignored.
        //   In this file, comments are used for explaining each string.
        // - Write your translated string inside the two quotation marks.
        // - If you need to use a quotation mark inside any of your translated
        //   strings, write it as \" instead.
        // - If the original string has any special formatting
        //   (e.g. space at the beginning or end), keep the formatting the same.
        // - If you want the English text to be shown for a specific string,
        //   replace the string with null (without any quotation marks).
        // - For any Discord-specific terminology (e.g. servers), use the same
        //   translated term that Discord officially uses for your language.

        // Notes about softkey command labels:
        // - Each softkey label has two variations, a short and a long one.
        // - In this translation file, the short labels are listed above the long ones.
        // - Short labels are used in places where there is limited screen space.
        // - Keep short labels as short as possible, ideally below 10 characters.
        //   If needed, you may use abbreviations.
        // - If a long label is short enough to where it could be used as a
        //   short label, use the same string for both labels.

        // Placeholder file name shown when the name of an attachment in the attachment view screen could not be loaded.
        "Fil utan namn",

        // Title text for the attachment picker (native file picker) screen.
        "Välj tilläggsfil",

        // Softkey labels for going back to the previous screen.
        "Bakåt",
        "Bakåt",

        // Softkey label for closing a menu.
        // Currently used in the attachment picker for closing the whole picker (because there is also a "Back" softkey for going back one directory)
        "Stäng",
        "Stäng",

        // Title text for attachment view screen.
        "Tilläggsfiler",

        // Softkey labels for refetching contents of channel view or attachment view.
        "Uppdatera",
        "Uppdatera",

        // Softkey labels used in channel or DM list for marking the selected channel or DM as read.
        "Markera som läst",
        "Markera som läst",

        // Softkey labels used in channel and DM lists for marking every DM or every channel in the currently shown server as read.
        "Markera allt som läst",
        "Markera allt som läst",

        // Generic "Select" softkey labels.
        "Välj",
        "Välj",

        // Softkey labels for sending a message in the currently open channel.
        "Skicka",
        "Skicka meddelande",

        // Softkey labels for sending a reply to the selected message.
        "Svara",
        "Svara",

        // Softkey labels for sending an attachment in the currently open channel.
        "Ladda upp",
        "Ladda upp fil",

        // Softkey labels for copying the text content of the selected message.
        "Kopiera",
        "Kopiera innehåll",

        // Softkey labels for editing the selected message.
        "Redigera",
        "Redigera",

        // Softkey labels for deleting the selected message.
        "Radera",
        "Radera",

        // Softkey labels for selecting an URL in the selected message. This opens a screen where each URL found in the message is listed, and one can be selected to be opened in the device's browser.
        "Öppna länk",
        "Öppna länk",

        // Channel view title suffix when reading older messages.
        " (Äldre meddelanden)",

        // Text shown at the center of the channel view when it is empty (no messages).
        "Inget att se här",

        // Channel view banner text shown when reading older messages and a new message arrives via the gateway.
        "Uppdatera för att läsa nya meddelanden",

        // Channel view banner text shown when a gateway disconnect occurred and an automatic reconnect is in progress.
        "Återuppkopplar",

        // Channel view banner shown when a message is being sent by the client.
        "Skickar meddelande",

        // Channel view banner shown when a message is being edited by the client.
        "Redigerar meddelande",

        // Channel view banner shown when a message is being deleted by the client.
        "Raderar meddelande",

        // Channel view banner shown when messages are being loaded, e.g. during a refresh or after a message was sent by the client.
        "Laddar meddelanden",

        // Suffix for channel view banner text when one person is typing.
        // Example: "aa is typing"
        " skriver",

        // Suffix for channel view banner text when two or three people are typing.
        // Example: "aa, bb, cc are typing"
        " skriver",

        // Suffix for channel view banner text when more than three people are typing.
        // Example: "4 people are typing"
        " flera personer skriver",

        // Comma separator used to separate usernames in the channel view banner text shown when people are typing.
        ", ",

        // Error messages shown when trying to upload a file, delete a message, or edit a message, and the current proxy server is a direct HTTPS-HTTP proxy (and not a Discord J2ME specific proxy)
        "Denna proxy stödjer ej uppladdning av filer",
        "Denna proxy stödjer ej borttagning av meddelanden",
        "Denna proxy stödjer ej borttagning av meddelanden",

        // Error message shown when trying to open the native file picker and the device does not support the J2ME FileConnection API.
        "FileConnection stödjs ej av enheten",

        // Button labels for navigating between pages of messages in the channel view. Try to keep these as long as (or shorter than) the English strings.
        // In the old channel view, these are shown as softkey labels (these strings are short and long variations of each)
        "Äldre",
        "Visa äldre meddl.",
        "Nyare",
        "Visa nyare meddl.",

        // Parts of the button label for viewing attachments of a message.
        // Examples: "View 1 attachment", "View 2 attachments"
        "View ",
        " bifognad",
        " bifogade",

        // Title for confirmation screen shown when deleting a message.
        "Radera",

        // Body text for confirmation screen shown when deleting a message.
        "Radera detta meddelande?",

        // Generic softkey labels.
        "Ja",
        "Ja",
        "Nej",
        "Nej",
        "OK",
        "OK",

        // Placeholder name shown when fetching the name of an item (e.g. message author or DM) failed.
        "(okänd)",

        // Placeholder shown when the recipient message of a reply does not have any text content.
        "(inget innehåll)",

        // Placeholder message content shown when a message does not have any content that is supported by Discord J2ME.
        "(innehåll stödjs ej av DiscordJ2ME)",

        // Message content shown for a message that has been deleted.
        "(meddelande borttaget)",

        // Title text for direct message search screen.
        "Sök direktmeddelanden",

        // Guide text for text field in direct message search and "insert mention" screens.
        "Skriv användarnamn",

        // Error message shown when the searched user was not found in the direct messages list. Discord J2ME cannot initiate DM conversations based on only a username, so this message asks the user to use another client.
        "Användare ej hittad. Vänligen försök med en annan DM klient.",

        // Title text for direct message list.
        "Direktmeddelanden",

        // Generic "Search" softkey label. Currently used for searching for usernames in direct messages and when inserting a mention/ping.
        "Sök",
        "Sök",

        // Title text shown for all error message screens.
        "Fel",

        // Title text shown for guild (server) selector.
        "Servrar",

        // Title text shown for favorite servers list.
        "Favoriter",

        // Generic "Remove" softkey command. Currently used for removing a server from the favorites list.
        "Radera",
        "Radera",

        // Softkey command for adding a server to the favorites list.
        "Favoriter",
        "Lägg till favoriter",

        // Text shown when the gateway disconnects due to an error with the heartbeat thread. As this error message is quite technical, you may simplify/generalize it to, for example, "connection error".
        "Heartbeat tråd fel, gateway bortkopplad: ",

        // Error message shown when the supplied authentication token is invalid (HTTP Unauthorized).
        "Kolla din token",

        // Prefix of error message shown when the HTTP response has an error code.
        // The full message consists of this string and the code itself,
        // e.g. HTTP error 500
        "HTTP fel ",

        // Error message shown when trying to load attachments and the CDN URL hasn't been set (is empty).
        "CDN URL har inte definierats. Bifogningar inte tillgängliga.",

        // Parentheses. Don't change these unless your language uses a different writing system where a different type of parentheses is normally used.
        " (",
        ")",

        // Softkey labels for showing a text attachment's contents within the app.
        "Visa",
        "Visa som text",

        // Softkey labels for showing an attachment in the device's built-in web browser.
        "Öppna",
        "Öppna i webbläsare",

        // Generic "Loading..." text shown in loading screen and in "Insert mention" screen.
        "Laddar...",

        // Loading screen text shown when an attachment is being sent.
        "Skickar...",

        // Error message prefix shown when an error occurs while uploading an attachment.
        "Fel vid sändning av fil: ",

        // Generic "Skip" softkey label. Currently used for skipping an action in the key mapper.
        "Skip",
        "Skip",

        // Key press prompt shown in hotkey mapper.
        "Tryck knappen för att välja :",

        // Names of hotkey actions shown in the key mapper.
        // These are shown after the "Press the key to use for:" string.
        // "going back" only applies to the chat view, 
        "skicka ett meddelande",
        "svara på meddelande",
        "kopiera innehåll i meddelande",
        "uppdatera meddelanden",
        "tillbaka",

        // Error message prefix shown when a key has been mapped to an action and the user tried to map the same key to another action. The name of the already mapped action (see above) is written after this prefix.
        "Denna knapp är redan använd av",

        // Title text shown in login screen.
        "Logga in",

        // Proxy server warning message shown at the top of the login screen.
        "Använd endast proxies som du tror på!",

        // Help message for finding your token. Shown in login screen above the token field.
        "Token kan hittas med din webbläsares utvecklarverktyg (kolla online efter hjälp). Användning av alt konton är rekomenderat.",

        // "Use Wi-Fi" option shown in login screen on BlackBerry devices.
        "Använd Wi-Fi",

        // Labels of text fields shown in the login screen.
        // You don't need to use these acronyms if they don't make sense in your language. Translations like "Server URL" and "Image server URL" are acceptable too.
        "API URL",
        "CDN URL",
        "Gateway URL",
        "Token",

        // Softkey label for confirming the login options in the login screen.
        "Logga in",
        "Logga in",

        // Softkey command for exiting the application.
        "Avsluta",
        "Avsluta",

        // "Use gateway" option shown in login screen.
        "Använd gateway",

        // Label for radio button field for token sending options.
        "Skicka token som",

        // Token sending options.
        "Rubrik (förinställd)",
        "JSON",
        "Query parameter",

        // Error messages shown when trying to login and the token or API URL fields are empty.
        "Please enter your token",
        "Please specify an API URL",

        // Main menu items.
        // "Log out" brings you back to the login screen where you enter your token and other login settings.
        "Servrar",
        "Favoriter",
        "Direktmeddelanden",
        "Inställningar",
        "Logga ut",

        // Title text shown in "Insert mention" screen (for adding a ping when writing a message).
        "Sätt in ping",

        // Label shown for username search results in "Insert mention" screen. Shown if more than one user matches the username query.
        "Resultatet av din sökning",

        // Message shown when the username query resulted in no matches in the "Insert mention" screen.
        "Inga resultat hittade",

        // Error message shown when selecting "Insert" in the "Insert mention" screen and none of the search results (radio buttons) were picked.
        "Användare inte vald",

        // Prefix and suffix of status message shown when a user has been added to a group DM. The whole message is in the form "added X to the group"
        "added ",
        " till gruppen",

        // Status message shown when a user has left a group DM.
        "lämnade gruppen",

        // Prefix and suffix of status message shown when a user has removed another user from a group DM. The whole message is in the form "removed X from the group".
        "tog bort ",
        " från gruppen",

        // Status messages.
        "startade ett samtal",
        "ändrade gruppens namn",
        "ändrade gruppens ikonbild",
        "satte fast ett meddelande",
        "anslöt till servern",
        "boostade servern",

        // Prefix of status message shown when a user has boosted the server and the server has reached a certain boosting level. The level is appended to the end of this string, in the form "boosted the server to level X".
        "boostade servern till nivå ",

        // Prefix of message content when the message is a sticker.
        // The whole message is in the form of "(sticker: Name)"
        "(sticker: ",

        // Placeholder name for a sticker when the sticker's name could not be fetched.
        "okänd",

        // Message timestamp hour-minute separator, day-month separator, and AM/PM indicators.
        // Note: order of day and month cannot be changed currently
        ":",
        "/",
        "A",
        "P",

        // Softkey labels for inserting a mention/ping in the "send message" screen.
        "Nämnande",
        "Sätt in nämnande",

        // Prefixes of title text for "send message" screen.
        // The full title is in the form of "Send message (@user)" or "Send message (#channel)".
        "Skicka meddelande (@",
        "Skicka meddelande (#",

        // Error message shown when trying to insert a mention into a message and the gateway connection is not active.
        "Kräver aktiv gateway uppkoppling",

        // Title text for "copy message content" screen.
        "Kopiera meddelande",

        // Title text for "edit message content" screen.
        "Redigera meddelande",

        // Title text for gateway disconnect prompt screen.
        "Bortkopplad",

        // Main body text for gateway disconnect prompt screen.
        "Gateway fel. Vill du återuppkoppla dig till gateway igen?",

        // Top label for disconnection message shown in gateway disconnect prompt screen. The disconnection message is either a message sent by the Discord gateway (such as "requesting client reconnect") or a Java exception.
        "Meddelande",

        // Prefix for top body text shown in the reply form. The whole top text is in the form "Replying to @user". The contents of the recipient message are shown below this.
        "Svarar på ",

        // Top label for the message entry box in the reply form.
        "Ditt meddelande:",

        // Checkbox for selecting whether to mention/ping the recipient. Shown in the reply form.
        "Nämn mottagare",

        // Title text for settings menu.
        "Inställningar",

        // Settings screen heading for themes section.
        "Tema",

        // Theme options.
        "Mörk",
        "Ljus",
        "Svart",

        // Settings screen heading for miscellaneous user interface related settings.
        "Användarinterface",

        // Settings option for enabling the old channel view user interface (from version 1.1 and below).
        "Använd äldre UI",

        // Settings option for using 12-hour time format in timestamps.
        "12-timmar tid",

        // Settings option for using the Java-based file picker for sending attachments. If disabled, the web-based file picker is used.
        "Inbyggd filväljare",

        // Settings option for automatically reconnecting to the gateway if the connection closes.
        "Gateway auto återuppkoppling",

        // Settings option for enabling icons in server and direct message lists.
        "Server/DM ikoner",

        // Settings option for enabling nickname role colors.
        "Namnfärger",

        // Settings screen heading for message author font size.
        "Typsnitt för meddelande",

        // Font size options.
        "Liten",
        "Medium",
        "Stor",

        // Settings screen heading for message content font size.
        "Meddelandeinnehåll textstorlek",

        // Settings screen heading for message load count. This is the amount of messages that are loaded and shown at a time.
        "Antal laddade meddelanden",

        // Settings screen heading for selecting attachment file format.
        "Tilläggsformat på filer",

        // Settings screen heading for maximum attachment size in pixels.
        "Maximal.bifogad storlek",

        // Settings screen heading for profile picture shape.
        // Note: The word "avatar" was used here because "profile picture shape" is too long to fit on one row on some phones, and I didn't want to shorten it as "PFP".
        "Avatar shape",

        // Settings options for profile picture shape. "Circle (HQ)" is circle but with anti-aliasing and smoothing enabled.
        "Ruta",
        "Cirkel",
        "Cirkel (HQ)",

        // Settings section for profile picture resolution.
        "Avatarbild upplösning",

        // Settings options for profile picture resolution. Placeholder means the PFPs won't get downloaded, but instead a placeholder (username's initials) is shown.
        "Placeholder only",

        // Resolution options. Used for profile picture resolution and menu icon resolution.
        "Av",
        "16 px",
        "32 px",

        // Settings section for menu icon size.
        "Ikonstorlek på Meny",

        // Settings section for controlling the display of reply messages.
        "Visa svar som",

        // Settings option to show replies as only the recipient (in the form "Author -> Recipient").
        "Enda mottagare",

        // Settings option to show replies with the whole recipient message.
        "Fullständigt meddelande",

        // Settings section for hotkey action management.
        "Snabbvalsknappar",

        // Settings option to use "default" hotkeys. When enabled, the J2ME game actions (ABCD) are used for hotkey actions, instead of user-defined key bindings. I named it "default" due to the lack of a better term for people who aren't familiar with J2ME development.
        "Förinställda snabbvalsknappar",

        // Softkey label for opening the key remapper in the settings menu. The long variant of the label is shown as the button text.
        "Välj knappfunktion",
        "Byt funktion för snabbvalsknapp",

        // Generic softkey labels. Currently used in settings menu.
        "Spara",
        "Spara",
        "Stäng",
        "Stäng",

        // Error message shown when trying to open an URL (e.g. attachment)from the app, but the phone does not support opening URLs while keeping the app running in the background.
        "Appen måste stängas innan URL kan öppnas.",

        // Prefix of error message shown when an error occurs when trying to open an URL.
        "URL kunde inte öppnas (",

        // Suffix of error message shown when an error occurs when trying to open an URL. The actual URL is shown after this message.
        ")\n\nDu kan försöka att manuellt kopiera URL på din enhets webbläsare: ",

        // Title text for URL list screen ('Open URL' option in channel view).
        "Välj URL",

        // Softkey labels for inserting a mention in the "Insert mention" screen.
        "Lägg till",
        "Lägg till"
    };
}