/**
 * at first, i thought about adding the library for object import, 
 * but as far as we are going to store them in DataBase it is just a text file
 * in JSON structure.
 * 
 * For creating of topic structure following recourses were used:
 * www.amason.com
 * www.willhaben.at
 * www.4chan.org 
 * www.wikipedia.org
 * 
 * 
 * For better results service-sensitive keywords were used(news->retweet, ).
 * Shortenning of words are used, to stick closer to the nature of the messages(Application->app, saxophone->sax)
 * No spelling correctness cross-check is assumed(words like "aple","swarowsky" are not added to keywords by default).
 * No words written in other languages, than English.
 * No Transliterated words. 
 * 
 * 
 * ToDo: handling of same keywords in different topics.
 * 
 * 
 */
/**
 * @author opossumvirginia
 *
 */
package topics;