package lebui.countries;

import java.util.ArrayList;
import java.util.List;

public class SimpleDataAccessor {

    private List<Country> mCountries;

    public List<Country> getCountries() {
        return mCountries;
    }

    public void loadData() {
        mCountries = new ArrayList<>();

        mCountries.add(new Country(
                R.drawable.brunei_image, R.drawable.brunei_flag,
                "Brunei", 415717, 5765, new String[] {"Malay"},
                "Brunei is a resource rich country in terms of petroleum and natural gas. Bordered by the South China Sea on Borneo's northwestern shore, Brunei shares a common border with the Malaysian state, Sarawak. The country has a population of about 374,000 (July 2007), comprised of Malay, Chinese and other indigenous people. Its culture is derived from the Old Malay located in the Malay Archipelago. Brunei's monarchy has ruled for over six centuries. The Sultanate of Brunei's influence peaked between the 15th and 17th centuries when its control extended over coastal areas of northwest Borneo and the southern Philippines. Subsequent internal strife over royal succession and colonial expansion led Brunei into decline until it became a British protectorate in 1888. In 1984, Brunei claimed back independence and restored power to the Sultan. Brunei's official language is Bahasa Melayu or Standard Malay which is used in all areas of public life including the government, the printed media, and broadcasting. English is also spoken in various domains of the public and private life.\n" +
                        "\n" +
                        "Brunei shares a common culture and history with the Malay based on its geographical location. It also employs the Malay writing system. This system is rooted in the Arabic and South Asian alphabets which date back at least five centuries. It was widely used until the recent times when the use of the Latin based alphabet became the norm in writing many of the native languages. During the years of foreign control, the British heavily influenced all publishing in Brunei. Towards the end of that period a number of publications in native languages began. When Brunei finally became an independent country in 1984, the people were able to continue to expand their printing capacity. The number of publications produced in Brunei has grown steadily since that time. Most of what is published in the country is in Malay, with fewer publications in other languages like Chinese and English. Along with printed formats, electronic information is also available. The people of Brunei have embraced this technology in areas where they have access to it. Bruneians are establishing an increasing presence on the Web."
        ));

        mCountries.add(new Country(
                R.drawable.cambodia_image, R.drawable.cambodia_flag,
                "Cambodia", 15458332, 181035, new String[] {"Khmer"},
                "The old kingdoms in the area now known as Cambodia were some of the first in Southeast Asia. They also left behind some of the grandest structures in the region, such as the massive complex known as Angkor Wat. Geographically, the area was an ideal place for the formation of a powerful kingdom with the Mekong River and Tonle Sap providing ample supplies of fish and water for agriculture. The current population, numbering around fourteen million, considers the old kingdoms a great national heritage. Most of the people in Cambodia speak Khmer, though there are also dozens of other languages spoken by the various ethnic groups that make up the remainder of the population. Owing to its rural, farm centered population base, Cambodia has only a few cities, with the capital city of Phnom Penh being the largest, yet still small when compared to the large cities of most other Southeast Asian nations. Over time the Khmer people developed writing systems similar to many of their neighbors, such as Thailand, Laos, and Burma. These alphabets were borrowed from earlier writing systems brought out of India hundreds of years earlier. Many other groups in the country lived without any writing until modern times.\n" +
                        "\n" +
                        "Written literature in Cambodia began as engravings on stone many hundreds of years ago. These stone engravings were generally used to mark the extent of various ancient kingdoms' power over the area. Over time the use of palm leaves as writing material became popular as well. Palm leaf manuscripts were used to record such things as religious teachings, royal chronologies, medicinal knowledge, and early literature in poetic verse. The methods of recording information on handwritten manuscripts have been passed down through the generations until today. In more recent times European explorers, traders and missionaries introduced printing to the people of Cambodia, especially when France took control of the area in the late 1800's. Printing in Cambodia during the French period was limited early on and began to increase towards the end of French control after World War Two. When Cambodia became an independent country in 1954, and following the devastating Khmer Rouge period in the late 1970's, the people of Cambodia were able to continue printing on a limited scale. The number of books produced in Cambodia has slowly increased over time yet still lags behind the output of most other Southeast Asian nations. Along with information in printed formats, electronic information is also available, though Cambodia has been touched by the electronic revolution much less than many of its Southeast Asian neighbors. Even so, electronic documents are now being produced in the country at an increasing rate each year."
        ));

        mCountries.add(new Country(
                R.drawable.easttimor_image, R.drawable.easttimor_flag,
                "East Timor", 1201542, 15410, new String[] {"Tetum", "Portuguese"},
                "After almost 500 years of colonial contact and rule, East Timor is the youngest nation in Southeast Asia. It is located to the northwest of Australia, at the eastern end of the Indonesian archipelago, and covers the eastern half of the island of Timor. Much of the current population, numbering about one million, speaks Tetun (or Tetum) and Portuguese as their official languages. East Timor was under the Portuguese control until 1975, and was occupied by Indonesia until 1999, then became fully independent in 2002. A two decade struggle for independence from Indonesia destroyed a majority of the country's infrastructure, including homes, irrigation systems, water supply systems, schools, and nearly 100% of the country's electrical grid.\n" +
                        "\n" +
                        "Timor was originally inhabited by Papuan language speakers before the arrival of Tetun speakers from Celebes Island about a thousand years ago. Following trade network connections and colonization by the Portuguese in the 16th century, Portuguese also became a spoken language in East Timor. It was as equally important of a language as was Tetun. The Latin writing system, employed in Portuguese writing, was also adopted to write Tetun. Following its independence from Indonesia in 2002, East Timor tried to develop an official Tetun language, based on Dili Tetun and other conservative and rural varieties, and to phase out Indonesian from its administration. Studies about East Timor are on the rise. Publications in Tetun are also increasing steadily alongside those in English and Portuguese. Besides information in printed formats, electronic information is also available and the people of East Timor are beginning to embrace this technology. The East Timor government is now establishing an increasingly large presence on the Web to introduce its young nation to the world."
        ));

        mCountries.add(new Country(
                R.drawable.indonesia_image, R.drawable.indonesia_flag,
                "Indonesia", 255461700, 1904569, new String[] {"Indonesian"},
                "Indonesia is a richly diverse country, which has led at times to conflict in the past, especially between different religious groups, though most of the population is Muslim. Because Indonesia is made up of hundreds of islands, the people are culturally and linguistically diverse. In modern times, efforts to bring the country together under one culture and language have had some success, but they have not been able to erase generations of diversity and the real physical separation of the islands. Much of the current population, numbering around two-hundred-fifty million, speaks the national language, Indonesian, as a first, second, or even third language. Of all the islands, Java is the most densely populated with a number of large cities, including the massive city of Jakarta, while the rest of the country is made up of smaller cities and rural areas.\n" +
                        "\n" +
                        "Before the arrival of Europeans some five hundred years ago, the Indonesian people developed writing systems based on Arabic and South Asian alphabets that were used by traders frequenting the area. These writing systems were widely used until recent times when the use of Latin based alphabets became the norm for writing many of the native languages, a practice that is still observed today. Still, many groups in Indonesia lived without any writing until modern times. During the four hundred years of foreign control, Europeans heavily influenced any publishing in Indonesia. Towards the end of that period a number of Indonesians began to produce publications in native languages. When Indonesia finally became an independent country after World War II, the people were able to continue to expand their printing capacity. The number of publications produced in Indonesia has grown steadily since that time. Most of what is published in the country is in Indonesian, with much less in other languages. Along with information in printed formats, electronic information is also available and the Indonesians have embraced this technology where they have access to it, mainly in the cities. Indonesians are establishing an increasingly large presence on the Web."
        ));

        mCountries.add(new Country(
                R.drawable.laos_image, R.drawable.laos_flag,
                "Laos", 6803699, 236800, new String[] {"Lao"},
                "Laos, officially known as the Lao Peoples Democratic Republic, is the only landlocked country in Southeast Asia. Mostly rugged and mountainous, the landscape of Laos is crisscrossed by a number of tributaries to the Mekong River which flows along its western border. Historically, this rough landscape divided the population into small groups of people living in towns and villages scattered throughout the area. The current population, numbering around six million, remains mostly scattered in the rural countryside, thus maintaining the country's ethnic and linguistic diversity. The official language of Laos is Lao, the language of the Lao people who comprise a slight majority of the population. There are also dozens of other languages spoken by the various ethnic groups that make up the remainder of the population. Owing to its rural, farm centered population base, Laos has but a few cities centered along the Mekong River valley which are small when compared to the large cities of most other Southeast Asian nations. Over time the Lao people and several related groups in the area developed writing systems similar to many of their neighbors, such as Thailand, Cambodia, and Burma. These alphabets were borrowed from earlier writing systems brought out of India hundreds of years earlier. Many others lived without any writing until modern times.\n" +
                        "\n" +
                        "Written literature in Laos began as engravings on stone many hundreds of years ago. These stone engravings were generally used to mark the extent of various ancient kingdoms' power over the area. Over time the use of palm leaves as writing material became popular. During the time when the first Lao kingdoms were established in the area, some 600 years ago, palm leaf manuscripts were used to record such things as religious teachings, royal chronologies, medicinal knowledge, and early literature in poetic verse. Other types of materials were occasionally used to record information by hand as well, such as mulberry paper. The methods of recording information on handwritten manuscripts have been passed down through the generations until today. In more recent times European explorers, traders and missionaries introduced printing to the people of Laos, especially when France took control of the area in 1893. Printing in Laos during the French period was limited early on and began to increase towards the end of French control after World War Two. When Laos became an independent country in 1954, and following the revolution culminating in 1975, the people of Laos were able to continue printing on a limited scale. The number of books produced in Laos has slowly increased over time from only a few dozen per year to several hundred now. Along with information in printed formats, electronic information is also available, though Laos has been touched by the electronic revolution much less than many of its Southeast Asian neighbors. Even so, electronic documents are now being produced in the country at an increasing rate each year.\n"
        ));

        mCountries.add(new Country(
                R.drawable.malaysia_image, R.drawable.malaysia_flag,
                "Malaysia", 31039000, 330803, new String[] {"Bahasa Malaysia"},
                "Malaysia is a richly diverse country due to its historical and geographical makeup. Because Malaysia is located on a number of islands and a large section of mainland peninsula, the people are culturally and linguistically diverse. In modern times, especially during the colonial period, other groups immigrated to Malaysia from China and South Asia further contributing to the ethnic mix. Much of the current population, numbering around twenty-five million, identifies with one of three groups, Indian, Chinese, or Malay, though this oversimplified distinction leaves out a vast number of other groups, especially on the island of Borneo. A fourth and much smaller group, the Orang Asli, thought to be the original inhabitants of the mainland forests and mountains have been marginalized nearly to the point of extinction. After the introduction of Islam by Muslim traders many hundreds of years ago the area was controlled by various Muslim rulers until the area fell under British control in the 1800's. Due to its key position along the international trade routes, Europeans took an early interest in the area. Initially the British vowed to support local rulers while the outsiders were to simply advise them on a number of key issues, but this arrangement fell apart over time as the British increasingly took a much more direct role in running the affairs of the land and sea.\n" +
                        "\n" +
                        "Before the arrival of Europeans some five hundred years ago, the Malay people developed writing systems based on Arabic and South Asian alphabets used by traders frequenting the area. These writing systems were used widely until recent times when the use of Latin based alphabets became the norm to write many of the native languages, a practice that is still observed today. Still, many groups in Malaysia lived without any writing until modern times. During the years of foreign control, Europeans controlled or heavily influenced any publishing in Malaysia. Towards the end of that period a number of Malaysians began to produce publications in native languages. When Malaysia finally became an independent country after World War II the people were able to continue to expand their printing capacity. The number of publications produced in Malaysia has grown steadily since that time. Most of what is published in the country is in Malay, with lesser amounts in other languages, such as Chinese or English. Along with information in printed formats, electronic information is also available and the Malaysians have embraced this technology where they have access to it, mainly in the cities. Malaysians are establishing an increasingly large presence on the Web."
        ));

        mCountries.add(new Country(
                R.drawable.myanmar_image, R.drawable.myanmar_flag,
                "Myanmar", 51486253, 676578, new String[] {"Burmese"},
                "Myanmar, often still referred to by its old name of Burma, has a rich history and culture that is often overlooked because of its current political situation. The mostly rugged and mountainous landscape of Burma is sliced north to south by several great rivers, including the Irrawaddy which forms a large and productive delta as it flows into the sea. Historically, this rough landscape divided the population into numerous ethnic groups that roughly translate into the modern states of Burma today, though many smaller groups are not represented on the political map. The current population, numbering around forty-eight million, remains mostly scattered in the rural countryside, thus maintaining the country's ethnic and linguistic diversity. The official language of Burma is Burmese, though there are also dozens of other languages spoken by the various ethnic groups that make up the remainder of the population. Much of the population lives in rural farming communities; however there are a few large cities, such as Yangon (Rangoon) on the Irrawaddy River. Over time the Burmese people and several other groups in the area developed writing systems similar to many of their neighbors, such as Thailand, Cambodia, and Laos. These alphabets were borrowed from earlier writing systems brought out of India hundreds of years earlier. Many other groups lived without any writing until modern times.\n" +
                        "\n" +
                        "Written literature in Burma began as engravings on stone many hundreds of years ago. These stone engravings were generally used to mark the extent of various ancient kingdoms' power over the area. Over time the use of other writing materials became popular, such as palm leaves, mulberry paper, different metals and even ivory on occasion. During the time of the old Burmese kingdoms, these manuscripts were used to record such things as religious teachings, royal chronologies, medicinal knowledge, and early literature in poetic verse. The methods of recording information on handwritten manuscripts have been passed down through the generations until today. In more recent times European explorers, traders and missionaries introduced printing to the people of Burma, especially when England took control of the area during the 1800's. Printing in Burma during the British period focused on official documents, though religious materials and some newspapers were produced. When Burma became an independent country after World War II the people of Burma were able to continue and expand their printing capacity. The number of publications produced in Burma initially grew but has slowed due to strict controls placed on the publishing industry by the military government. Along with information in printed formats, electronic information is also available, though Burma has been touched by the electronic revolution much less than many of its Southeast Asian neighbors. Even so, electronic documents are now being produced in the country at an increasing rate each year."
        ));

        mCountries.add(new Country(
                R.drawable.philippines_image, R.drawable.philippines_flag,
                "Philippines", 103256300, 300000, new String[] {"Filipino", "English"},
                "The Philippines is a richly diverse country, which has led at times to conflict in the past, especially between the mostly Christian northern islands and the Muslim south. Because the Philippines is made up of hundreds of islands, the people are diverse culturally and linguistically. In modern times, efforts to bring the country together under one culture and language have had some success, but they have not been able to erase generations of diversity and the real physical separation of the islands. Much of the current population, numbering around ninety million, speaks Tagalog as a first, second, or even third language. For example, in the central Philippine islands many people speak their native tongue, then Cebuano as a regional second language, Tagalog as the national language, and also English as a result of earlier American control and influence on the nation. English is spoken by many people in the larger cities, especially around Manila. Metro Manila is a sprawling and densely populated group of cities, while the rest of the country is made up of smaller cities and rural areas.\n" +
                        "\n" +
                        "Before the arrival of the Spanish some five hundred years ago, the Filipino people developed writing systems. These were mostly wiped out by the Spanish as they conquered the islands and converted much of the population to Catholicism. During the Spanish period, lasting up to the end of the 1800's, the educated population used Spanish as their means of written communication. The Spanish alphabet was also used to write many of the native languages, a practice that is still observed today. Still, many groups in the Philippines lived without any writing until modern times. During the four hundred years of Spanish control, the Spaniards controlled or heavily influenced any publishing in the Philippines. Towards the end of the Spanish period a number of Filipino nationalists began to produce publications in Tagalog. This continued when the United States took control of the country, however much of the publishing during this period switched from Spanish to English. The stated goal during the period of United States control in the first half of the twentieth century was to move the Philippines towards independence. During this time, local people gained more control over the information industry. When the Philippines finally became an independent country after World War II the people were able to continue and expand their printing capacity. The number of publications produced in the Philippines has grown steadily since that time. Much of what is published in the country still comes out in English, with some in Tagalog and much less in other languages. Along with information in printed formats, electronic information is also available and the Filipinos have embraced this technology where they have access to it, mainly in the cities. Filipinos are establishing an increasingly large presence on the Web."
        ));

        mCountries.add(new Country(
                R.drawable.singapore_image, R.drawable.singapore_flag,
                "Singapore", 5535000, 719.1, new String[] {"English", "Malay", "Mandarin", "Tamil"},
                "Singapore occupies a key position along the international shipping routes through Southeast Asia and has thus become an important port and financial center over time. For the most part, the history of the island of Singapore is that of its neighbors, Indonesia and Malaysia. Only in modern times, beginning during the late colonial period, was the island looked at as something separate from its neighbors. During this time other groups immigrated to Singapore from China and South Asia. Much of the current population, numbering over four million, identifies with one of three groups, Indian, Chinese, or Malay. After the introduction of Islam by Muslim traders many hundreds of years ago the area around Singapore was controlled by various Muslim rulers until the island fell under British control in the 1800's. Due to its key position along the international trade routes and British policies supporting free trade, the island quickly became an important trade center. The island remained under British control until after World War Two when it became independent following a brief union with Malaysia.\n" +
                        "\n" +
                        "Before the arrival of Europeans some five hundred years ago, the people in and around Singapore developed writing systems based on Arabic and South Asian alphabets used by traders frequenting the area. These writing systems were widely used until recent times when the use of Latin based alphabets became the norm to write many of the native languages, a practice that is still observed today. During the years of foreign control, the British controlled or heavily influenced any publishing in Singapore. When Singapore finally became an independent country after World War II the people were able to take over and expand their printing capacity. The number of publications produced in Singapore has grown steadily since that time. Most of what is published in the country comes out in English, with lesser amounts in other languages, such as Chinese or Malay. Along with information in printed formats, electronic information is also widely available. Singapore has a well established web presence and is a leader in information technology in the region."
        ));

        mCountries.add(new Country(
                R.drawable.thailand_image, R.drawable.thailand_flag,
                "Thailand", 67959000, 513120, new String[] {"Thai"},
                "Modern day Thailand developed out of a number of ancient kingdoms that were at times bitter enemies and at times close allies. Just over two-hundred years ago the current line of Thai kings was established as they completed the process of conquering and absorbing several complete kingdoms and land from a number of others. This history, along with the country's geographical makeup work together to create a modern nation that is unified yet retains regional distinctions. The mostly rugged and mountainous northern area of Thailand is populated by a majority of lowland Thai people with numerous highland groups living throughout the area. In the drier and flatter Northeast, or Isan region, the people are closely related to the Lao across the border in Laos and further south to the Khmer of Cambodia, though a number of other groups of people live in the area as well. Southern Thailand, along the peninsula, still deals with the tensions of history more than other regions of the country. Here, Thai and Malay populations live side by side in a sometimes contentious relationship while foreign tourists enjoy visits to the famous Thai resort islands. Central Thailand's plains and river valleys are the heart of the nation's agricultural system. They are also the center of government, including the sprawling city of Bangkok. The official language of Thailand is Thai, which most of the country's sixty-plus million people speak as a first or second language due to the government's aggressive educational programs in the recent past. There are also dozens of other languages spoken by the various ethnic groups in all regions of the country. Over time the Thai people and several related groups in the area developed writing systems similar to many of their neighbors, such as Laos, Cambodia, and Burma. These alphabets were borrowed from earlier writing systems brought out of India hundreds of years earlier. Many others lived without any writing until modern times.\n" +
                        "\n" +
                        "Written literature in Thailand began as engravings on stone many hundreds of years ago. These stone engravings were generally used to mark the extent of various ancient kingdoms' power over the area. Over time the use of palm leaves as writing material became popular. During the time when the old Thai kingdoms and alphabets were still young, some 600 years ago, palm leaf manuscripts were used to record such things as religious teachings, royal chronologies, medicinal knowledge, and early literature in poetic verse. Other types of materials were occasionally used to record information by hand as well, such as mulberry paper. The methods of recording information on handwritten manuscripts have been passed down through the generations until today. In more recent times European explorers, traders and missionaries introduced printing to the people of Thailand, especially when France and the England took control of the neighboring areas in the 1800's. Printing in Thailand took hold early on and has increased over time to the point that now thousands of books are published each year. Along with information in printed formats, electronic information is also available, especially in the large modern cities. Electronic documents are being produced in the country at an increasing rate each year."
        ));

        mCountries.add(new Country(
                R.drawable.vietnam_image, R.drawable.vietnam_flag,
                "Vietnam", 91700000, 332698, new String[] {"Vietnamese"},
                "Along its eastern edge, Vietnam's landscape is rugged and mountainous. Flowing out of these mountains is a number of rivers that over time have created fertile valleys and deltas, such as the Mekong River delta in the south and the Red River valley in the north. Historically, this landscape allowed for the development of a Vietnamese population center in the north that became the base of later expansion into the rest of the current land area of Vietnam. This early Vietnamese population was heavily influenced by their large northern neighbors, the Chinese, who ruled over them for around one-thousand years. Before the Vietnamese expansion out of the Red River valley, the area was divided into many groups of people. Smaller groups lived scattered throughout the mountainous regions while the Chams in central Vietnam built a large and centralized kingdom. Over time the Vietnamese population gained its independence from China and expanded to the south. They eventually destroyed the Cham kingdom in the central part of the country and settled in the Khmer areas in the southern Mekong Delta. While many other ethnic groups still reside in Vietnam, the overwhelming majority of the population is now Vietnamese. The current population, numbering around eighty-five million, lives mostly in rural farmland, though several cities such as Hanoi and Ho Chi Minh City are very large and ever expanding. The official language of Vietnam is Vietnamese, though there are also dozens of other languages spoken by the various ethnic groups.\n" +
                        "\n" +
                "Written literature in Vietnam was originally based on and borrowed directly from the Chinese. After the Chinese period the Vietnamese continued to use Chinese for written communication, however they also began to develop a writing system for Vietnamese based on the Chinese characters. This system existed up until the early 1900's when it was replaced by the Latin based alphabet developed by European missionaries several hundred years earlier. When France took control of the area in the 1800's they insured the success of the new alphabet at the expense of the old Chinese based system. Printing in Vietnamese before the French period consisted mostly of woodblocks and paper to reproduce Chinese classics and a growing number of original Vietnamese works. During the French period printing expanded, especially when the new alphabet system became more widely used. After 1954, during the war years and a divided Vietnam printing continued on in both the north and south with a large portion of printed material dedicated to wartime issues. The number of books produced in Vietnam has rapidly increased over time and the current publishing industry is thriving. Along with information in printed formats, electronic information is also available and electronic documents are now being produced in the country at an increasing rate each year."
        ));
    }
}
