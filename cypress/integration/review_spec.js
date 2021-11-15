describe('check cottage reviews', () => {
    it('check cozy cottage vrbo reviews', () => {
        cy.visit('https://www.vrbo.com/2111572');
        cy.get('.reviews-summary__num-reviews.text-link').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('7 Reviews');
        });
    })

    it('check haven hideaway vrbo reviews', () => {
        cy.visit('https://www.vrbo.com/2111556');
        cy.get('.reviews-summary__num-reviews.text-link').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('6 Reviews');
        });
    })
})

describe('check cottage prices for a week on Jaqua', () => {
    it('check Cozy May prices', () => {
        cy.visit('https://www.milakeshorevacations.com/vacation-rental-home.asp?PageDataID=160236');
        cy.get('#txtStartDate').click();
        cy.get('div.datepicker').click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(30).click();
        cy.get('button.btn.btn-primary').click();
        // 5/24 - 5/31
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$214.29 X 7 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$1500');
        });
    })

    it('check Cozy June prices', () => {
        cy.get('a.property-instant-quote-change-dates').first().click();
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$278.57 X 7 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$1950');
        });
    })

    it('check Cozy July prices', () => {
        cy.get('a.property-instant-quote-change-dates').first().click();
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$278.57 X 7 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$1950');
        });
    })

    it('check Cozy August prices', () => {
        cy.get('a.property-instant-quote-change-dates').first().click();
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$214.29 X 7 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$1500');
        });
    })

    it('check Haven May prices', () => {
        cy.visit('https://www.milakeshorevacations.com/vacation-rental-home.asp?PageDataID=168702');
        cy.get('#txtStartDate').click();
        cy.get('div.datepicker').click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(30).click();
        cy.get('button.btn.btn-primary').click();
        // 5/24 - 5/31
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$200 X 7 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$1400');
        });
    })

    it('check Haven June prices', () => {
        cy.get('a.property-instant-quote-change-dates').first().click();
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$250 X 7 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$1750');
        });
    })

    it('check Haven July prices', () => {
        cy.get('a.property-instant-quote-change-dates').first().click();
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$250 X 7 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$1750');
        });
    })

    it('check Haven August prices', () => {
        cy.get('a.property-instant-quote-change-dates').first().click();
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$200 X 7 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$1400');
        });
    })
})

describe('check cottage prices for 3 days on Jaqua', () => {
    it('check Cozy May prices', () => {
        cy.visit('https://www.milakeshorevacations.com/vacation-rental-home.asp?PageDataID=160236');
        cy.get('#txtStartDate').click();
        cy.get('div.datepicker').click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(30).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(33).click();
        cy.get('button.btn.btn-primary').click();
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$225 X 3 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$675');
        });
    })

    it('check Cozy June prices', () => {
        cy.get('a.property-instant-quote-change-dates').first().click();
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(27).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$295 X 3 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$885');
        });
    })

    it('check Cozy July prices', () => {
        cy.get('a.property-instant-quote-change-dates').first().click();
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(27).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$295 X 3 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$885');
        });
    })

    it('check Cozy August prices', () => {
        cy.get('a.property-instant-quote-change-dates').first().click();
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(27).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$225 X 3 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$675');
        });
    })

    it('check Haven May prices', () => {
        cy.visit('https://www.milakeshorevacations.com/vacation-rental-home.asp?PageDataID=168702');
        cy.get('#txtStartDate').click();
        cy.get('div.datepicker').click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(30).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(33).click();
        cy.get('button.btn.btn-primary').click();
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$210 X 3 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$630');
        });
    })

    it('check Haven June prices', () => {
        cy.get('a.property-instant-quote-change-dates').first().click();
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(27).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$275 X 3 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$825');
        });
    })

    it('check Haven July prices', () => {
        cy.get('a.property-instant-quote-change-dates').first().click();
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(27).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$275 X 3 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$825');
        });
    })

    it('check Haven August prices', () => {
        cy.get('a.property-instant-quote-change-dates').first().click();
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(14).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(17).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('.discounted-rent').first().should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$275 X 3 nights');
        });
        cy.get('.discounted-rent').eq(1).should(($div) => {
            const text = $div.text();
            expect(text).to.eq('$825');
        });
    })
})

describe('check that 2 day bookings are not allowed', () => {
    it('check Cozy May', () => {
        cy.visit('https://www.milakeshorevacations.com/vacation-rental-home.asp?PageDataID=160236');
        cy.get('#txtStartDate').click();
        cy.get('div.datepicker').click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(30).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(32).click();
        cy.get('button.btn.btn-primary').click();
        cy.get('div.property-instant-quote-message').first().should(($div) => {
            const text = $div.text().trim();
            expect(text).to.eq('This Property is Available but requires a stay of at least 3 nights.');
        })
    })

    it('check Cozy June', () => {
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(26).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
                cy.get('div.property-instant-quote-message').first().should(($div) => {
            const text = $div.text().trim();
            expect(text).to.eq('This Property is Available but requires a stay of at least 3 nights.');
        })
    })

    it('check Cozy July', () => {
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(26).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('div.property-instant-quote-message').first().should(($div) => {
            const text = $div.text().trim();
            expect(text).to.eq('This Property is Available but requires a stay of at least 3 nights.');
        })
    })

    it('check Cozy August', () => {
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(26).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('div.property-instant-quote-message').first().should(($div) => {
            const text = $div.text().trim();
            expect(text).to.eq('This Property is Available but requires a stay of at least 3 nights.');
        })
    })

    it('check Haven May prices', () => {
        cy.visit('https://www.milakeshorevacations.com/vacation-rental-home.asp?PageDataID=168702');
        cy.get('#txtStartDate').click();
        cy.get('div.datepicker').click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(30).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(32).click();
        cy.get('button.btn.btn-primary').click();
        cy.get('div.property-instant-quote-message').first().should(($div) => {
            const text = $div.text().trim();
            expect(text).to.eq('This Property is Available but requires a stay of at least 3 nights.');
        })
    })

    it('check Haven June prices', () => {
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(26).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('div.property-instant-quote-message').first().should(($div) => {
            const text = $div.text().trim();
            expect(text).to.eq('This Property is Available but requires a stay of at least 3 nights.');
        })
    })

    it('check Haven July prices', () => {
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(24).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(26).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('div.property-instant-quote-message').first().should(($div) => {
            const text = $div.text().trim();
            expect(text).to.eq('This Property is Available but requires a stay of at least 3 nights.');
        })
    })

    it('check Haven August prices', () => {
        cy.get('#txtStartDate').click();
        cy.get('th.next').first().click();
        cy.get('td.day').eq(14).click();
        // change end date
        cy.get('#txtEndDate').click();
        cy.get('td.day').eq(16).click();
        cy.get('button.btn.btn-primary').click();
        cy.wait(500);
        cy.get('div.property-instant-quote-message').first().should(($div) => {
            const text = $div.text().trim();
            expect(text).to.eq('This Property is Available but requires a stay of at least 3 nights.');
        })
    })
})
