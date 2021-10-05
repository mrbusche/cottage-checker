describe('check cottages', () => {
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
